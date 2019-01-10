package Product;

/**
 * Classe représentant une télévision
 * Elle hérite de la classe Product
 */
public class Television extends Product {

    /**
     * Taille de la télévision
     */
    private Integer size;

    /**
     * Type d'affichage de l'écran
     */
    private String slabType;

    /**
     * Constructeur de la classe Televison
     * @param name Nom du produit
     * @param description Description du produit
     * @param price Prix du produit
     * @param size Taille de l'écran de la télévision
     * @param slabType Type d'écran de la télévison
     */
    public Television(String name, String description, Double price, Integer size, String slabType) {
        super(name,description,price);
        this.size=size;
        this.slabType = slabType;
    }

    /**
     * Getter de la taille de l'écran
     * @return Renvoie la taille de l'écran
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Getter du type d'affichage
     * @return Renvoie le type d'affichage
     */
    public String getSlabType() {
        return slabType;
    }

    /**
     * Méthode permettant l'affichage des caractéristiques d'un produit dans le terminal
     */
    @Override
    public void look() {
        super.look();
        System.out.println("    Taille de l'écran : " + size +"\"");
        System.out.println("    Type d'affichage : " + slabType);
    }
}
