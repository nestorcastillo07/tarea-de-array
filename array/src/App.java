import java.util.Scanner;

public class App {  //Néstor Moisés Castillo Garay 1m1-s 2024-1363u

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        int array[] = llenado();

        System.out.println("num seleccionados");

        Mostrar(array);

        System.out.println("num seleccionados de forma inversa ;b");
        inverso(array);

    }
    
    // 
    public static int[] llenado() {

        int[] arreglo = new int[tamv];
    
        boolean condicion2 = true;

        do{
            try{

        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valo [" + i + "]");
            arreglo[i] = leer.nextInt();
            
        }

        condicion2 = false;
    } catch (Exception e){
        System.out.println("ingrese valores validos");
        leer.nextLine();
    }
    }
    while (condicion2);
        
    return arreglo;
    }
 
    //
    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

    }
    
    
    //Aqui va el metodo de inverso
    //los voy a pasar a todos:D
    public static void inverso (int[]arregloinverso){

        for (int i = arregloinverso.length - 1; i >= 0; i--) {
            System.out.println(arregloinverso[i]);
            
        }
    }

    

}