package Delivery;

/**
 * Classe représentant l'absence de livraison, il faut aller en magasin
 */
public class TakeAwayDelivery implements Delivery {

    /**
     * Méthode qui renvoie le prix de la livraison
     * @return Renvoie le prix de la livraison
     */
    @Override
    public Double getPrice() {
        return 0.0;
    }

    /**
     * Méthode qui renvoie le type de la livraison
     * @return Renvoie le type de la livraison
     */
    @Override
    public String getDeliveryType() {
        return "A recuperer en magasin 0.0€";
    }

    /**
     * Méthode qui renvoie ou récupérer la livraison
     * @return Renvoie le lieu ou la livraison doit être récupérée
     */
    @Override
    public String getPlace() {
        return "La livraison est à venir récupérer en magasin";
    }
}
