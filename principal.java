
public class principal {

    public static void main(String[] args) {
        int[][] matriz = new int[100][100];
       
        int b = 0, c = 0;
        for (int i = 0; i < 100; i++) {
            matriz[b][c] = 1;
            b++;
            c++;

        }
        

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        
    }

}
