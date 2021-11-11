import java.util.Scanner;

public class Palindromo {

    // Algoritmo para verificar se uma palavra eh palindromo.
    public static boolean isPalindromo() {

        Scanner inputPalavra = new Scanner(System.in);
        String palavra = inputPalavra.next();
        String palavraInvertida = new StringBuffer(palavra).reverse().toString();

        if (palavra.equals(palavraInvertida)) {
            System.out.println("É uma palavra palindromo.");
            return true;
        } else {
            System.out.println("Não é uma palavra palindromo.");
            return false;
        }

    }
}
