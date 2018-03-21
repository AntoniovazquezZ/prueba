/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_15_arreglos_multidim_4;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA_15_ARREGLOS_MULTIDIM_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][]aiEdades;//Arreglo para capturar grupos, cantidad de alumnos 
        int iNoGrp, iNoAlu;//Cantidad de grupos, cantidad de alumnos 
        Scanner scCaptu = new Scanner(System.in);//Captura del teclado 
        
        System.out.println("Introduce el # de grupos: ");
        iNoGrp=scCaptu.nextInt();//El # de grupos son las filas de arreglo 
                                 //(Matiz)
        aiEdades = new int [iNoGrp][];
        //FOR para preguntar para cada grupo la cantidad de alumnos
        //for (int i = 0; i < iNoGrp; i++) {
            
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Cuantos alumnos tiene el grupo: "+(i+1)+"i");
            iNoAlu = scCaptu.nextInt();
            aiEdades[i]=new int [iNoAlu]; 
            
        }
        //Captura las edades: Recorrer el arreglo
        for (int i = 0; i < aiEdades.length; i++) {//Filas (Grupos)
            for (int j = 0; j < aiEdades[i].length; j++) {//Alumnos para el Gpo Actual 
                System.out.println("Cual es la edad Grupo "+ i +" - Alumno "+ j +" ? ");
            aiEdades[i][j] = scCaptu.nextInt();    
            }
            
        }
        //Imprimir las edades capturadas
        for (int i = 0; i < aiEdades.length; i++) {//Filas (Grupos)
            for (int j = 0; j < aiEdades[i].length; j++) {//Alumnos para el Gpo Actual 
                System.out.println("Cual es la edad de Grupo "+ i +" -Alumno "+ j +" es " + aiEdades[i][j]);
        
    }
    
        }
        //Calcular promedio de edadesi
        int iAcum, iAcumTodos=0, iAcumAlu=0;
        for (int i = 0; i < aiEdades.length; i++) {
            iAcum =0;
            iAcumAlu= iAcumAlu + aiEdades[i].length;
            for (int j = 0; j < aiEdades[i].length; j++) {
                iAcum = iAcum + aiEdades[i][j];
                iAcumTodos = iAcumTodos + aiEdades[i][j];
            }                                                        //sumatoria/#de alumnos
            System.out.println("El primedio para el grupo "+i+" = "+(iAcum/aiEdades[i].length));
        }
            System.out.println("El promedio de todos los grupos es:" +(iAcumTodos/iAcumAlu));

    }
}
