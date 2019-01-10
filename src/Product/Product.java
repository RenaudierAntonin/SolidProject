package Product;

import Bill.Bill;

/**
 * Classe représentant un produit quelconque
 */
public class Product {

    /**
     * Nom du produit
     */
    private String name;

    /**
     * Description du produit
     */
    private String description;

    /**
     * Prix du produit
     */
    private Double price;

    /**
     * Constructeur du produit
     * @param name Nom du produit
     * @param description Description du produit
     * @param price Prix du produit
     */
    public Product(String name,String description,Double price) {
        this.name=name;
        this.description=description;
        this.price=price;
    }

    /**
     * Getter du nom du produit
     * @return Renvoie le nom du produit
     */
    public String getName() {
        return name;
    }

    /**
     * Getter de la description du produit
     * @return Renvoie la description du produit
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter du prix du produit
     * @return Renvoie le prix du produit
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Setter du prix du produit
     * @param price Prix du produit
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Fonction permettant d'ajouter un produit à une facture
     * @param bill Facture à laquelle on ajoute le produit
     * @param quantity Nombre de produit a ajouter
     */
    public void buy(Bill bill, Integer quantity) {
        bill.addProduct(this,quantity);
    }

    /**
     * Méthode permettant l'affichage des caractéristiques d'un produit dans le terminal
     */
    public void look() {
        System.out.println("Produit :");
        System.out.println("    Nom : " + name);
        System.out.println("    Description : " + description);
        System.out.println("    Prix : " + price +"€");
    }
}
