/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_19_arreglos_args;

/**
 *
 * @author danie
 */
public class EVA_19_ARREGLOS_ARGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iDatos = {1,2,3,4,5};
        
        for (int iDato : iDatos) {
            System.out.println("Valor = " +iDato);
                    ImprimeArreglo(iDatos);

        }
        iDatos = new int [5];
        iDatos[0]=10;
        iDatos[1]=20;
        iDatos[2]=30;
        iDatos[3]=40;
        iDatos[4]=50;
        for (int iDato : iDatos) {
            System.out.println("Valor = " +iDato);
    }
    
    }
    public static void ImprimeArreglo(int[]aiArre){
        for (int i : aiArre) {
            
            System.out.println("Valor = "+i);
        }
  
    }
}
