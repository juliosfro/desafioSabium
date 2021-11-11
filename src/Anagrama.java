import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static boolean isAnagrama() {

        Scanner inputPrimeiraPalavra = new Scanner(System.in);
        String palavra1 = inputPrimeiraPalavra.next();

        Scanner inputSegundaPalavra = new Scanner(System.in);
        String palavra2 = inputSegundaPalavra.next();

        char[] a = palavra1.toCharArray();
        char[] b = palavra2.toCharArray();

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
