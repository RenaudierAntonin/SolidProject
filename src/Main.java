import Bill.Bill;
import Customer.Customer;
import Delivery.DirectDelivery;
import Delivery.ExpressDelivery;
import Delivery.RelayDelivery;
import Delivery.TakeAwayDelivery;
import Product.Fridge;
import Product.Product;
import Product.Television;
import Writer.FileWriter;
import Writer.TerminalWriter;

public class Main {

    public static void main(String[] args) {

        /**
         * Création des différents produits
         */
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599.0, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189.0, 130, true);

        /**
         * Création du profil du client
         */
        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        /**
         * Création de la facture, on peut tester chaque type de livraison
         */
        //Bill bill = new Bill(customer, new DirectDelivery());
        //Bill bill = new Bill(customer, new ExpressDelivery("Paris"));
        Bill bill = new Bill(customer, new RelayDelivery(27));
        //Bill bill = new Bill(customer, new TakeAwayDelivery());

        /**
         * Ajout des produits sur la facture
         */
        bill.addProduct(cafe,1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        /**
         * Ecriture de la facture dans un fichier
         */
        bill.generate(new FileWriter("facture_leblanc"));

        /**
         * Ecriture de la facture dans le terminal
         */
        bill.generate(new TerminalWriter());

    }
}
