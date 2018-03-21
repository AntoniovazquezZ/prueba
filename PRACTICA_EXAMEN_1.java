/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_examen_1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class PRACTICA_EXAMEN_1 {

    static double iPromedio;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiEdad[];
        Scanner scCaptu = new Scanner(System.in);
        System.out.println("¿Cuantas edades desdeas ingresar?");
        int edades = scCaptu.nextInt();
        aiEdad = new int[edades];
        System.out.println("Introduce las edades: ");
        for (int i = 0; i < aiEdad.length; i++) {

            aiEdad[i] = scCaptu.nextInt();//

        }

        for (int i = 0; i < aiEdad.length; i++) {
            System.out.println("La edad es: " + aiEdad[i]);
            iPromedio = (iPromedio + aiEdad[i]);

        }
        System.out.println("La media es: " + iPromedio / edades);
        calcularModa(aiEdad);
        double varianza = calculatVarianza(aiEdad, edades);
        calcularDesviacionEstandar(varianza);

    }

    public static void calcularModa(int[] arrayModa) {

        int moda = 0;
        int numMax = 0;
        for (int i = 0; i < arrayModa.length; i++) {
            int numdeVeces = 0;
            for (int j = 0; j < arrayModa.length; j++) {
                if (arrayModa[i] == arrayModa[j]) {
                    numdeVeces++;

                }
                if (numdeVeces > numMax) {
                    moda = arrayModa[i];
                    numMax = numdeVeces;

                }
            }

        }
        System.out.println("La moda es: " + moda + " Y se repite: " + numMax);
    }

    /**
     * Metodo que calcula la varianza dado un arreglo y una media
     *
     * @param arrayVarianza Arreglo de edades
     * @param media mandar media
     * @return
     */
    public static double calculatVarianza(int[] arrayVarianza, double media) {
        double varianza = 0;

        for (int i = 0; i < arrayVarianza.length; i++) {
            double rango = 0;
            rango = Math.pow(arrayVarianza[i] - media, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / 10f;
        return varianza;
    }

    public static void calcularDesviacionEstandar(double varianza) {
        double desviacion = Math.sqrt(varianza);
        System.out.println("Desviacion " + desviacion);
    }
}
