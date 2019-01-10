package Delivery;

/**
 * Classe représentant la livraison dans un point relais, le prix varie en fonction du relais choisi
 */
public class RelayDelivery implements Delivery {

    /**
     * Entier repésentant le numéro du point relais
     */
    private Integer relayNumber;

    /**
     * Constructeur de la classe
     * @param relayNumber Numéro du point relais
     */
    public RelayDelivery(Integer relayNumber) {
        this.relayNumber = relayNumber;
    }

    /**
     * Méthode qui renvoie le prix de la livraison, il varie en fonction du point relais
     * @return Renvoie le prix de la livraison
     */
    @Override
    public Double getPrice() {
        if (relayNumber <1) {
            return 0.0;
        }
        if (1<= relayNumber && relayNumber <=22) {
            return 0.0;
        }
        if (23<= relayNumber && relayNumber <=47) {
            return 2.99;
        }
        else {
            return 4.99;
        }
    }

    /**
     * Méthode qui renvoie le type de la livraison
     * @return Renvoie le type de la livraison
     */
    @Override
    public String getDeliveryType() {
        return "Livraison en point relais " +this.getPrice() +"€";
    }

    /**
     * Méthode qui renvoie ou récupérer la livraison
     * @return Renvoie le lieu ou la livraison doit être récupérée
     */
    @Override
    public String getPlace() {
        return "La livraison est à récupérer au point relais numéro " + relayNumber;
    }

}
