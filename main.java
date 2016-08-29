
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args){
        
        boolean tmp = true;

        Desarrolladores conjuntos = new Desarrolladores();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Empresea de Desarrollo");
        System.out.println("Ingrese el tipo de interfaz SET a utilizar");
        System.out.println("");
        System.out.println("0- Hashset");
        System.out.println("1- Treeset");
        System.out.println("2- Linkedhashset");
        int inSet = entrada.nextInt();
        
        conjuntos.ISet(inSet);
       
        while(tmp){
            System.out.println("Ingrese opcion:");
            System.out.println("1- Ingresar desarrollador");
            System.out.println("2- Interseccion entre desarrolladores");
            System.out.println("3- Subconjunto");
            System.out.println("4- Conjunto mas grande");
            System.out.println("5- Salir");
            
            int param = entrada.nextInt();
            
            if(param==1){
            	
                System.out.println("Ingrese el nombre");
                String nombre = entrada.next();
               
                System.out.println("Ingrese que tipo de desarrollador es "+nombre);
                System.out.println("1- Java");
                System.out.println("2- Web");
                System.out.println("3- Celulares");
                int conjunto = entrada.nextInt();
                conjuntos.ingresarPersona(nombre, conjunto);
            }else if(param==2){
                System.out.println("Ingrese ");
                System.out.println("1:Int. Java-Web");
                System.out.println("2:Java-Cel");
                System.out.println("3:Cel-Web");
                System.out.println("4:los tres");
                int cual=entrada.nextInt();
                if(cual==1){
                    conjuntos.interseccion(true, true, false);
                }else if(cual==2){
                    conjuntos.interseccion(true, false, true);
                }else if(cual==3){
                    conjuntos.interseccion(false, true, true);
                }else if(cual==4){
                    conjuntos.interseccion(true, true, true);
                }
            }else if(param==3){
                conjuntos.subconjunto();
            }else if(param==4){
                conjuntos.masGrande();
            }else if(param==5){
                tmp = false;
            }
        }
    }
}