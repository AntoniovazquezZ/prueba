/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9_arreglosmulti;

/**
 *
 * @author danie
 */
public class EVA_9_ArreglosMulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArreglo3D[][][]=new int [2][2][2];
        
        for (int i = 0; i < 2; i++) {//FILAS
            for (int j = 0; j < 2; j++) {//COLUMNAS
                for (int k = 0; k < 2; k++) {//NIVELES
                    aiArreglo3D[i][j][k]=(int)(Math.random()*100)+1;
                    
                }
                
            }
            
        }
        for (int i = 0; i < 2; i++) {//FILAS
            for (int j = 0; j < 2; j++) {//COLUMNAS
                for (int k = 0; k < 2; k++) {//NIVELES
                    System.out.println("["+aiArreglo3D[i][j][k]+"]");
    }
               
}
        }}}