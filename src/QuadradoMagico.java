public class QuadradoMagico {

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
}
