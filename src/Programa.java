import java.util.Arrays;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        matriz[0][0] = 3;
        matriz[0][1] = 4;
        matriz[0][2] = 8;

        matriz[1][0] = 10;
        matriz[1][1] = 5;
        matriz[1][2] = 0;

        matriz[2][0] = 2;
        matriz[2][1] = 6;
        matriz[2][2] = 7;

        if (isQuadradoMagico(matriz)) {
            System.out.println("Matriz eh um quadrado magico.");
        } else {
            System.out.println("Matriz nao eh um quadrado magico.");
        }

        isAnagrama();
    }

    public static boolean isPalindromo() {
        // Algoritmo para verificar se uma palavra eh palindromo.

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

    public static boolean isQuadradoMagico(int[][] matriz) {
        int soma = 0;
        int soma2 = 0;
        // Ira somar os elementos da primeira linha.
        for (int j = 0; j < matriz.length; j++) {
            soma = soma + matriz[0][j];
        }

        // Ira somar as demais linhas.
        for (int i = 1; i < matriz.length; i++) {
            soma2 = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma2 = soma2 + matriz[i][j];
            }
            if (soma != soma2) {
                return false;
            }
        }

        // Ira somar as colunas.
        for (int j = 0; j < matriz[0].length; j++) {
            soma2 = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma2 = soma2 + matriz[i][j];
            }
            if (soma != soma2) {
                return false;
            }
        }

        // Ira somar a diagonal principal.
        soma2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma2 = soma2 + matriz[i][i];
        }
        if (soma != soma2) {
            return false;
        }

        // Ira somar a diagonal secundaria.
        soma2 = 0;
        int linhaAtual = 0;
        for (int j = matriz.length - 1; j >= 0; j--) {
            soma2 = soma2 + matriz[linhaAtual][j];
            linhaAtual++;

        }
        if (soma != soma2) {
            return false;
        }
        return true; // Eh uma matriz quadrado magico.
    }

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