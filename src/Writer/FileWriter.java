package Writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe servant à l'écriture dans un fichier
 */
public class FileWriter implements Writer {

    /**
     * Nom du fichier
     */
    private String filename;

    /**
     * Chemin ou on va stocker le fichier
     */
    private Path path;

    /**
     * String à écrire dans le fichier
     */
    private String content;

    /**
     * Constructeur de la classe
     * @param filename Nom du fichier dans lequel on va écrire
     */
    public FileWriter(String filename) {
        this.filename = filename;
    }

    /**
     * Commence le processus d'écriture
     */
    @Override
    public void start() {
        path = Paths.get(filename);
        content = "";
    }

    /**
     * Ecrit une ligne dans le fichier
     * @param line String à écrire
     */
    @Override
    public void writeLine(String line) {
        content += line + "%n";
    }

    /**
     * Arrête l'écriture
     */
    @Override
    public void stop() {
        try {
            Files.write(path, String.format(content).getBytes());
        } catch (IOException e) {
            System.err.println("Impossible de rédiger la facture");
        }
    }
}