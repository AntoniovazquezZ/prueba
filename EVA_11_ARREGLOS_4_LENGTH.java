/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_11_arreglos_4_length;

/**
 *
 * @author danie
 */
public class EVA_11_ARREGLOS_4_LENGTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] aiDatos = new int [5];
       aiDatos[0]=15;
       aiDatos[1]=20;
       aiDatos[2]=30;
       aiDatos[3]=35;
       aiDatos[4]=45;
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + i + "] = "+ aiDatos[i]);
            
        }
        int[] aiCopia= new int [5];
        System.out.println("Copia");
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia[i]=aiDatos[i];//Guardamos los datos del primer arreglo
               
        }
        aiDatos = new int [10];//creamos un arreglo mas grande
        for (int i = 0; i < aiCopia.length; i++) {//solicitamos los datos de los arreglos guardados
            aiDatos[i]=aiCopia[i];
                        System.out.println("[" + i + "] = "+ aiDatos[i]);

        }
       
    }
      
            
}