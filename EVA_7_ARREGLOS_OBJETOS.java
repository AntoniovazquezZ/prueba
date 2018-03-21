/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_7_arreglos_objetos;

/**
 *
 * @author danie
 */
public class EVA_7_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO DE ALUMNOS 
        ALUMNO aaAlumnos[]=new ALUMNO[10];
        for (int i = 0; i < 10; i++) {
            aaAlumnos[i] = new ALUMNO ("Daniel", "16550723",0);
            
        }
          //Imprimir los datos de los alumnos   
           for (int i = 0; i < 10; i++) {
               System.out.println("Nombre "+aaAlumnos[i].getsNom());
               System.out.println("NoControl "+aaAlumnos[i].getsNoCtrl());
               System.out.println("Carrera "+aaAlumnos[i].getiCarre());
               
               
    }
           //CREAR COPIA DEL ARREGLO
           ALUMNO aaCopia [] = new ALUMNO [10];
           for (int i = 0; i < 10; i++) {
           aaCopia[i]=new ALUMNO{aaAlumnos[i].getsNom,aaAlumnos[i].getsNoCtrl,aaAlumnos[i].getiCarre}/
               
            
        }
           
    }}
class ALUMNO {
    private String sNom;
    private String sNoCtrl;
    private int iCarre; 
    
    public ALUMNO (String sNombre, String NCtrl, int Carrera){
       
        
        this.sNom=sNombre;
        this.iCarre=Carrera;
        this.sNoCtrl=NCtrl;
    
}

        public String getsNom() {
            return sNom;
        }

        public void setsNom(String sNom) {
            this.sNom = sNom;
        }

        public String getsNoCtrl() {
            return sNoCtrl;
        }

        public void setsNoCtrl(String sNoCtrl) {
            this.sNoCtrl = sNoCtrl;
        }

        public int getiCarre() {
            return iCarre;
        }

        public void setiCarre(int iCarre) {
            this.iCarre = iCarre;
        }
        
        
       
    }
