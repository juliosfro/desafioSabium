import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Leitor {

    // Metodo para ler um arquivo de texto.
    public static String leitor(String path) throws IOException {
        List<String> linhas = Files.readAllLines(Paths.get(path));

        String texto = linhas.toString()
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "");

        return texto.toLowerCase()
                .replace(" ", "")
                .replace(",", "")
                .replace(".", "");
    }
}
