package Delivery;

/**
 * Classe représentant la livraison express, le prix varie en fonction de la ville
 */
public class ExpressDelivery implements Delivery{

    /**
     * Ville dans laquelle a lieu la livraison
     */
    public String city;

    /**
     * Constructeur de la classe
     * @param city Ville de la livraison
     */
    public ExpressDelivery(String city) {
        this.city = city;
    }

    /**
     * Méthode qui renvoie le prix de la livraison, il varie en fonction de la ville
     * @return Renvoie le prix de la livraison
     */
    @Override
    public Double getPrice() {
        if (city=="Paris") {
            return 6.99;
        }
        else {
            return 9.99;
        }
    }

    /**
     * Méthode qui renvoie le type de la livraison
     * @return Renvoie le type de la livraison
     */
    @Override
    public String getDeliveryType() {
        return "Livraison à domicile express " + this.getPrice() +"€";
    }

    /**
     * Méthode qui renvoie ou récupérer la livraison
     * @return Renvoie le lieu ou la livraison doit être récupérée
     */
    @Override
    public String getPlace() {
        return "La livraison arrivera directement chez vous dès que possible";
    }
}
