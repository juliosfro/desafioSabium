import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Programa {

    public static void main(String[] args) throws IOException {

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

        if (QuadradoMagico.isQuadradoMagico(matriz)) {
            //  System.out.println("Matriz eh um quadrado magico.");
        } else {
            System.out.println("Matriz nao eh um quadrado magico.");
        }

        // isAnagrama();

        String path = "src/texto.txt";
        String texto = Leitor.leitor(path);
        System.out.println("Quantidade de caracteres: " + texto.length());

        String temp = Leitor.leitor(path);
        List<String> temp1 = new ArrayList<String>();
        ArrayList<Integer> freq = new ArrayList<Integer>();

        for (int i = 0; i <= temp.length() - 1; i++) {
            temp1.add(Character.toString(temp.charAt(i)));
        }

        Set<String> uniqset = new HashSet<String>(temp1);
        for (String s : uniqset) {
            freq.add(Collections.frequency(temp1, s));
            double frequencia = Collections.frequency(temp1, s);
            double percentual =  frequencia * 100 / temp.length();
            String x =  new DecimalFormat("#,##0.00").format(percentual) ;
            System.out.println(s + " -->> " + Collections.frequency(temp1, s) + " vezes -->> " + x + "%.");
        }

    }

}

