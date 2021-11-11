import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static boolean isAnagrama() {

        Scanner inputPrimeiraPalavra = new Scanner(System.in);
        String palavraUm = inputPrimeiraPalavra.next();

        Scanner inputSegundaPalavra = new Scanner(System.in);
        String palavraDois = inputSegundaPalavra.next();

        char[] a = palavraUm.toCharArray();
        char[] b = palavraDois.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Eh um anagrama.");
            return true;
        } else {
            System.out.println("Não eh um anagrama.");
            return false;
        }

    }
}
