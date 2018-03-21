/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_18_for_each;

/**
 *
 * @author danie
 */
public class EVA_18_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iDatos = {5, 4, 3, 10, 9, 8, 7, 6, 8, 11};
        for (int iVal : iDatos) {
            System.out.println("Valor = " + iVal);
        }

        String lasCadenas[] = {"Mario", "Heri", "Irvin", "Juan", "Itzel"};
        for (String sCade : lasCadenas) {
            System.out.println("Cadena = " + sCade);
        }
        int aiMatriz[][] = new int[3][3];
        aiMatriz[0][0] = 10;
        aiMatriz[0][1] = 20;
        aiMatriz[0][2] = 30;
        aiMatriz[1][0] = 40;
        aiMatriz[1][1] = 50;
        aiMatriz[1][2] = 60;
        aiMatriz[2][0] = 70;
        aiMatriz[2][1] = 80;
        aiMatriz[2][2] = 90;

        for (int[] is : aiMatriz) {
            for (int i : is) {
                System.out.println("Valor = " + i);
            }
            int aiMatriz2[][][] = new int[3][3][3];
            for (int i = 0; i < aiMatriz2.length; i++) {
                for (int j = 0; j < aiMatriz2.length; j++) {
                    for (int k = 0; k < aiMatriz2.length; k++) {
                        aiMatriz2[i][j][k] = (int) (Math.random() * 10);
                    }
                }
            }
        }
        for (int[] is : aiMatriz) {
            for (int i : is) {
                for (int j : is) {
                    System.out.println(j);
                }
            }
        }

    }

}
