/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_evaluacion_objetos;

/**
 *
 * @author danie
 */
public class EVA_2_EVALUACION_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int iOtroVal=6;
   double dSalario=500.50;
Prueba pObj = new Prueba();
        System.out.println("iOtroVal=" + iOtroVal);
System.out.println("dSalario=" + dSalario);
        System.out.println("pObj="+pObj);//La direccion 
        System.out.println("pObj=" + pObj.iVal);//lo que esta dentro del Objeto 
// TODO code application logic here
    }
    
}
class Prueba{
    int iVal=3;
}