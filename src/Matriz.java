public interface Matriz {

    static int[][] matriz() {

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

        return matriz;

    }

    static void verificaQuadradoMagico() {

        if (QuadradoMagico.isQuadradoMagico(Matriz.matriz())) {
            System.out.println("Matriz eh um quadrado magico.");
        } else {
            System.out.println("Matriz nao eh um quadrado magico.");

        }

    }

}
