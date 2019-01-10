package Delivery;

/**
 * Interface correspondant aux différents type de livraison
 */
public interface Delivery {

    /**
     * Méthode qui renvoie le prix de la livraison
     * @return Renvoie le prix de la livraison
     */
    public Double getPrice();

    /**
     * Méthode qui renvoie le type de la livraison
     * @return Renvoie le type de la livraison
     */
    public String getDeliveryType();

    /**
     * Méthode qui renvoie ou récupérer la livraison
     * @return Renvoie le lieu ou la livraison doit être récupérée
     */
    public String getPlace();

}
