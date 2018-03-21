
public class principal {

    static int[] arrayImpar;
    static int[] arrayPar;
    static int a = 0;
    static   int b = 0;

    public static void main(String[] args) {
        /*  PRÁCTICA 5:
    CREAR UN ARREGLO CON 50 ELEMENTOS, LLENARLO CON VALORES ALEATORIOS ENTRE 1
    Y 100, E IMPRIMIR UNA LISTA CON LOS VALORES PARES QUE CONTENGA.*/
        int[] array = new int[50];
        int contpar = 0, contimpar = 0;
        // int[] arrayimpar = new int[50];
        // int[] arrayPar = new int[50];

        System.out.println("Arreglo de cincuenta: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            
            System.out.print("[" + array[i] + "]");
            if (array[i] % 2 == 0) {
              //  System.out.println(" El número " + array[i] + " es par");
                contpar++;

            } else {
                //  System.out.println(" El número " + array[i] + " es impar");
                contimpar++;

            }
        }

        arrayImpar = new int[contimpar];
        arrayPar = new int[contpar];
       
        //se llenan los arreglos impares  y pares
        for (int j = 0; j < array.length; j++) {

            if (array[j] % 2 == 0) {
                llenarArregloPar(array[j], a);
                a++;
            } else {
                llenarArregloImpar(array[j], b);
                b++;
            }

        }
        
        System.out.println("\n Arreglo de impares ");
        for (int i = 0; i < arrayImpar.length; i++) {
              System.out.print("[" + arrayImpar[i] + "], ");
        }
          System.out.println("\n Arreglo de pares");
          
        for (int i = 0; i < arrayPar.length; i++) {
             System.out.print("[" + arrayPar[i] + "], ");
        }
      
    }

    public static void llenarArregloImpar(int numeroImpar, int posImpar) {
        arrayImpar[posImpar] = numeroImpar;

    }

    public static void llenarArregloPar(int numeroPar, int posPar) {
         arrayPar[posPar] = numeroPar;
    }
    
    
}

/*
        
            if (array[j] % 2 == 0) {
              

                contpar++;

            } else {
               
                contimpar++;

            }
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                arrayPar2[a] = array[i];
                a++;

            } else {
                a++;
                // arrayimpar2[b]=array[b]; b++;

            }

        }
        System.out.println("Hay: " + contpar + " pares  en el arreglo");
        System.out.println("Hay: " + contimpar + " numeros impar en el arreglo");

        System.out.println("Pares");
        ImprimeArreglo(arrayPar2);
        System.out.println("Impares");
        ImprimeArreglo(arrayimpar2);
    }

    public static void ImprimeArreglo(int[] aiArre) {

        for (int i : aiArre) {

            System.out.println("[ " + i + "]");
        }

    }
}
 */
