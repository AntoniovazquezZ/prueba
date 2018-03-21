
public class principal {

    public static void main(String[] args) {
        double[][] matriz = new double[5][5];
        double[][] matriz2 = new double[5][5];
        double[][] matriz3 = new double[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random() * 10;
                matriz2[i][j] = Math.random() * 10;
                matriz3[i][j] = (matriz[i][j]) * (matriz2[i][j]);

            }

        }
        System.out.println("Matriz 1");
        ImprimeArreglo(matriz);
        System.out.println("");
        System.out.println("Matriz 2");
        ImprimeArreglo(matriz2);
        System.out.println("");
        System.out.println("Matriz 3");
        ImprimeArreglo(matriz3);

    }

    public static void ImprimeArreglo(double[][] aiArre) {
        for (double[] ds : aiArre) {
            for (double d : ds) {
                System.out.print("[" + d + "]");
            }
        }

    }
}
