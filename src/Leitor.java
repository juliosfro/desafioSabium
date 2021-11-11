import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;

public class Leitor {

    private static final String PATH = "src/texto.txt";
    private static String texto;

    // Metodo para ler um arquivo de texto.
    public static String leitor() throws IOException {
        List<String> linhas = Files.readAllLines(Paths.get(PATH));

        texto = linhas.toString()
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "");

        return texto.toLowerCase()
                .replace(" ", "")
                .replace(",", "")
                .replace(".", "");
    }

    public static int quantidadeCaracteres() throws IOException {
        int quantidadeDeCaracteres = Leitor.leitor().length();
        return quantidadeDeCaracteres;
    }

    public static void verificaCaracteres() throws IOException {
        String texto = Leitor.leitor();
        System.out.println("Quantidade de caracteres: " + Leitor.quantidadeCaracteres());

        String temp = Leitor.leitor();
        List<String> temp1 = new ArrayList<String>();
        ArrayList<Integer> freq = new ArrayList<Integer>();

        for (int i = 0; i <= temp.length() - 1; i++) {
            temp1.add(Character.toString(temp.charAt(i)));
        }

        Set<String> uniqset = new HashSet<String>(temp1);
        for (String s : uniqset) {
            freq.add(Collections.frequency(temp1, s));
            double frequencia = Collections.frequency(temp1, s);
            double percentual = frequencia * 100 / temp.length();
            String x = new DecimalFormat("#,##0.00").format(percentual);
            System.out.println(s + " -->> " + Collections.frequency(temp1, s) + " vezes -->> " + x + "%.");
        }
    }

}
