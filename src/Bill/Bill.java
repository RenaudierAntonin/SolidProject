package Bill;

import Customer.Customer;
import Delivery.Delivery;
import Product.Product;
import Writer.Writer;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe représentant la facture lors d'un achat
 */
public class Bill {

    /**
     * Client qui a effectué l'achat
     */
    private Customer customer;
    /**
     * Liste des produits achetés avec la quantité
     */
    private Map<Product,Integer> products;

    /**
     * Livraison qui a été sélectionnée
     */
    private Delivery delivery;

    /**
     * Constructeur de la facture
     * @param customer Client
     * @param delivery Livraison sélectionnée
     */
    public Bill(Customer customer, Delivery delivery) {
        this.customer=customer;
        this.products= new HashMap<Product,Integer>();
        this.delivery=delivery;
    }

    /**
     * Getter du client
     * @return Renvoie le client sur la facture
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Getter de la liste de produit
     * @return Renvoie la liste des produits achetés avec la quantité
     */
    public Map<Product, Integer> getProducts() {
        return products;
    }

    /**
     * Getter sur la livraison
     * @return Renvoie la livraison selectionnée
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * Méthode qui permet d'ajouter un produit dans la liste des achats
     * @param product Produit devant être ajouté à la facture
     * @param quantity Quantité de produit
     */
    public void addProduct(Product product,Integer quantity) {
        products.put(product,quantity);
    }

    /**
     * Genere le fichier pour la facture
     * @param writer Objet en charge de l'écriture
     */
    public void generate(Writer writer) {
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullName());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getDeliveryType());
        writer.writeLine("");
        writer.writeLine(delivery.getPlace());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + "€ - " + quantity + " unité(s)");
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getPrice() +"€");
        writer.writeLine("-----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal() +"€");
        writer.stop();
    }

    /**
     * Calcule le prix total pour la facture en prenant en compte les produits et le cout de livraison
     * @return Prix total
     */
    public Double getTotal() {
        double total = delivery.getPrice();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}
