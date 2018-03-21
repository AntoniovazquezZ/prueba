/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_16_arreglos_meses;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA_16_ARREGLOS_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] asMeses = {"Enero", "Febrero", "Marzo", 
        "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", 
        "Octubre", "Noviembre", "Diciembre"};
        int[] aiDias ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
        //EQUIVALENTE A:
        //
        /*
        string[] as Meses = new String [12]
        asMeses[0]
        ...
*/
        //Pregunta al usuario 
        Scanner scCaptu = new Scanner (System.in);
        System.out.println("Introdeuce # de mes [1 - 12]");
        int iMes = scCaptu.nextInt();
        System.out.println("El mes es: "+ asMeses[iMes-1]+ " y tiene "+aiDias[iMes-1] + " dias.");
        
        
        
    }
    
}
