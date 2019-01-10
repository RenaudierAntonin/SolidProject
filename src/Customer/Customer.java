package Customer;

/**
 * Classe représenant un client
 */
public class Customer {

    /**
     * Nom du client
     */
    private String fullName;
    /**
     * Addresse du client
     */
    private String address;

    /**
     * Constructeur du client
     * @param fullName Nom du client a crée
     * @param address Adresse du client a crée
     */
    public Customer(String fullName,String address) {
        this.fullName=fullName;
        this.address=address;
    }

    /**
     * Getter du nom du client
     * @return Renvoie le nom du client
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Getter de l'adresse du client
     * @return Renvoie l'addresse du client
     */
    public String getAddress() {
        return address;
    }

}
