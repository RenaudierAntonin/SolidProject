package Product;

/**
 * Classe représentant un frigo
 * Elle hérite de la classe Product
 */
public class Fridge extends  Product{

    /**
     * Volume du frigo
     */
    private Integer liter;
    /**
     * Boolean représentant la possession d'un congélateur dans le frigo
     */
    private Boolean freezer;

    /**
     * Constructeur de la classe Fridge
     * @param name Nom du produit
     * @param description Description du produit
     * @param price Prix du produit
     * @param liter Volume du frigo
     * @param freezer Possession d'un congélateur ou non
     */
    public Fridge(String name,String description, Double price, Integer liter, Boolean freezer) {
        super(name,description,price);
        this.liter=liter;
        this.freezer=freezer;
    }

    /**
     * Getter sur le volume du frigo
     * @return Renvoie le volume du frigo
     */
    public Integer getLiter() {
        return liter;
    }

    /**
     * Getter sur freezer
     * @return Renvoie la possession ou non d'un congélateur
     */
    public Boolean isFreezer() {
        return freezer;
    }

    /**
     * Méthode permettant l'affichage des caractéristiques d'un produit dans le terminal
     */
    @Override
    public void look() {
        super.look();
        System.out.println("    Capacité : " + liter +"L");
        System.out.println("    Freezer : " + freezer);
    }
}
