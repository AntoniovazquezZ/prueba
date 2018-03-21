/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_examen_7;

/**
 *
 * @author danie
 */
public class PRACTICA_EXAMEN_7 {

    public static void main(String[] args) {
        // TODO code application logic here
        int iDato[] = new int[50];
        int nMayor = iDato[0], nMenor = iDato[0], pMayor = 0, pMenor = 0;
        for (int i = 0; i < iDato.length; i++) {
            iDato[i] = (int) (Math.random() * 99) + 1;
            System.out.println("Valores " + iDato[i]);

        }
        for (int i = 0; i < iDato.length; i++) {
//se busca el dato mayor 
            if (iDato[i] > nMayor) {
//si se encuentra un dato mayor al actual, se actualiza el dato mayor
                nMayor = iDato[i];
//despues de actualizar el dato mayor se guarda la ubicacion del dato mayor
                pMayor = i;

            }
            if (iDato[i] < nMenor) {
                nMenor = iDato[i];
                pMenor = i;

            }

        }
        System.out.println(" El valor mayor es; " + nMayor + "Esta en la posicion: " + pMayor);
        System.out.println(" El valor menor es; " + nMenor + "Esta en la posicion: " + pMenor);

    }
}
