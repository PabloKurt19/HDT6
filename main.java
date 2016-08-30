
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args){
        
        boolean tmp = true;

        Desarrolladores conjuntos = new Desarrolladores();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Empresea de Desarrollo");
        System.out.println("Ingrese el tipo de interfaz SET a utilizar");
        System.out.println("");
        System.out.println("0- Hashset");
        System.out.println("1- Treeset");
        System.out.println("2- Linkedhashset");
        int inSet = scan.nextInt();
        
        conjuntos.ISet(inSet);
       
        while(tmp){
            System.out.println("Ingrese opcion:");
            System.out.println("1- Ingresar desarrollador");
            System.out.println("2- Interseccion entre desarrolladores");
            System.out.println("3- Subconjunto");
            System.out.println("4- Conjunto mas grande");
            System.out.println("5- Salir");
            
            int opcion = scan.nextInt();
            
            if(opcion == 1){
            	
                System.out.println("Ingrese el nombre");
                String nombre = scan.next();
               
                System.out.println("Ingrese que tipo de desarrollador es "+nombre);
                System.out.println("1- Java");
                System.out.println("2- Web");
                System.out.println("3- Celulares");
                int tipoDev = scan.nextInt();
                
                conjuntos.IngresarDev(nombre, tipoDev);
                
            }else if(opcion == 2){
            	
                System.out.println("Ingrese interseccion entre desarrolladores");
                System.out.println("1- Java - Web");
                System.out.println("2- Java - Celulares");
                System.out.println("3- Celulares - Web");
                System.out.println("4- Tres tipos de desarrolladores");
                
                int inter = scan.nextInt();
                if(inter == 1){
                    conjuntos.intersecciones(true, true, false);
                }else if(inter == 2){
                    conjuntos.intersecciones(true, false, true);
                }else if(inter == 3){
                    conjuntos.intersecciones(false, true, true);
                }else if(inter == 4){
                    conjuntos.intersecciones(true, true, true);
                }
            }else if(opcion == 3){
                conjuntos.subconjunto();
            }else if(opcion == 4){
                conjuntos.masGrande();
            }else if(opcion == 5){
                tmp = false;
            }
        }
    }
}