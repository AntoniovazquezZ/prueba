/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_examen_3;

/**
 *
 * @author danie
 */
public class PRACTICA_EXAMEN_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int ArreA[][] = new int[5][5];
        int ArreCopia[][] = new int[5][5];
        for (int i = 0; i < ArreA.length; i++) {//Filas: Esto recorre/lee todo el arreglo original
            for (int j = 0; j < ArreA.length; j++) {//Columnas: Recorre/lee todo el arreglo 
                ArreA[i][j] = (int) (Math.random() * 100);
                System.out.print("[" + ArreA[i][j] + "]");
                // TODO code application logic here
            }
            System.out.println("");

        }
        /*for (int j = 0; ArreA.length < ArreCopia.length; j--) {
            for (int k = 0; ArreCopia.length < ArreCopia.length; k--) {
                System.out.println("Copia Inversa");
                System.out.println(ArreCopia[j][k]);
                for (int i = 0; i < 10; i++) {
                    
                }
            }
        }*/
        for (int i = 0, j = ArreA.length - 1; i < ArreCopia.length; i++, j--) {
            for (int k = 0, l = ArreA[i].length - 1; k < ArreCopia[j].length; k++, l--) {
                ArreCopia[i][k] = ArreA[j][l];

            }
        }
        System.out.println("Copia");
        for (int[] is : ArreCopia) {
            for (int i : is) {
                System.out.print("[" + i + "]");
            }
            System.out.println("");
        }
    }
}
