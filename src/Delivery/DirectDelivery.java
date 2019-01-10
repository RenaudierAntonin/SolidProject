package Delivery;

/**
 * Classe représentant la livraison à domicile
 */
public class DirectDelivery implements Delivery{

    /**
     * Méthode qui renvoie le prix de la livraison
     * @return Renvoie le prix de la livraison
     */
    @Override
    public Double getPrice() {
        return 4.99;
    }

    /**
     * Méthode qui renvoie le type de la livraison
     * @return Renvoie le type de la livraison
     */
    @Override
    public String getDeliveryType() {
        return "Livraison à domicile 4.99€";
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
