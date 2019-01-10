package Writer;

/**
 * Interface des différents type d'écriture possible
 */
public interface Writer {

    /**
     * Commence le processus d'écriture
     */
    public void start();

    /**
     * Ecrit une ligne dans le fichier
     * @param line String à écrire
     */
    public void writeLine(String line);

    /**
     * Arrête l'écriture
     */
    public void stop();
}
