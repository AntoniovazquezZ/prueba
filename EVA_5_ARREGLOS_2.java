/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_5_arreglos_2;

/**
 *
 * @author danie
 */
public class EVA_5_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static final int ARRE_TAMA = 30;
    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[]=new int [ARRE_TAMA];//declaramos un identificador de tipo arreglo de entero
        //arreglos siempre empezar en cero 
        //hay que movernos a un valor previo al tamaño del arreglo
       //for (int i = 0; i < aiEdad.length; i++) {
        for (int i = 0; i < ARRE_TAMA; i++) {
            System.out.println("aiEdad["+i+"]="+aiEdad[i]);// "<=29 ó <30" es lo mismo
            
        }
        aiEdad[0]=25;//Psicion cero (Primer posicion del arreglo) un valor de 25
        //Llenar con valores entre 0 y 36
        for (int i = 0; i < aiEdad.length; i++) {
            //math.random regresa valores entre 0 y 1
            //Hay que hacer un casting de double a entero (int)
            aiEdad[i]=(int)(Math.random()*36);
            
        }
        for (int i = 0; i < ARRE_TAMA; i++) {//Leemos nuestro arreglo
            System.out.println("aiEdad["+i+"]="+aiEdad[i]);
    }
    
}}
