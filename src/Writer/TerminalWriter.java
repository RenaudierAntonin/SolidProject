package Writer;

/**
 * Classe servant à l'écriture dans un terminal
 */
public class TerminalWriter implements Writer{

    /**
     * Commence le processus d'écriture
     */
    @Override
    public void start() {
        System.out.println();
    }

    /**
     * Ecrit une ligne dans le fichier
     * @param line String à écrire
     */
    @Override
    public void writeLine(String line) {
        System.out.println(line);
    }

    /**
     * Arrête l'écriture
     */
    @Override
    public void stop() {
        System.out.println();
    }
}
