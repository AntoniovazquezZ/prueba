/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_8_copia_arreglos_2;

/**
 *
 * @author danie
 */
public class EVA_8_COPIA_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int aiDatosorigen[]=new int [5];
        
        aiDatosorigen[0]=10;
        aiDatosorigen[1]=20;
        aiDatosorigen[2]=30;
        aiDatosorigen[3]=40;
        aiDatosorigen[4]=50;
        
        int sCopia[]=aiDatosorigen;
        
        for (int i = 0; i < aiDatosorigen.length; i++) {
            
            sCopia[i] = aiDatosorigen[i];
            
        }
        
            System.out.println("Imprime los valores del ");   // TODO code application logic here
    }
    
}
