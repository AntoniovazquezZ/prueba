/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_17_buscar_arreglos;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA_17_BUSCAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]iDatos =new int [5];
        for (int i = 0; i < iDatos.length; i++) {
            iDatos[i] = (int)(Math.random()*10)+1;
            System.out.print(iDatos[i]+" ");
            
        }
        Scanner scCaptu = new Scanner(System.in);
        System.out.println("¿Que valor deseas buscar ?");
        int iVal = scCaptu.nextInt();
        for (int i = 0; i < iDatos.length; i++) {
            if (iVal==iDatos[i])//lo encontramos
                System.out.println("El valo esta en la posicion "+i);
            //Si queremos detenerlo, usariamos un "break;"
            
        }
    }
    
}
