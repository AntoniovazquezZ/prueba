/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_13_arreglos_multidim_2;

/**
 *
 * @author danie
 */
public class EVA_13_ARREGLOS_MULTIDIM_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][]aiMatriz=new int [3][];
        System.out.println(aiMatriz);
     aiMatriz[0]=new int [2];
     System.out.println(aiMatriz[0]);
     aiMatriz[1]=new int [5];
             System.out.println(aiMatriz[1]);
     aiMatriz[2]=new int [10];
         System.out.println(aiMatriz[2]);
        for (int i = 0; i < aiMatriz.length; i++) {//FILAS 
            for (int j = 0; j < aiMatriz[i].length; j++) {//COLUMNAS
                System.out.println(aiMatriz[i][j]);
                
                
            }
            
        }
        // TODO code application logic here
    }
    
}
