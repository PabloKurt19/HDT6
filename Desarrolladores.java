	import java.util.Set;
	import java.util.HashSet;
	import java.util.TreeSet;
	import java.util.LinkedHashSet;
	import java.util.Scanner;


public class Desarrolladores {
	
	    Set JavaDev, CelularesDev, WebDev, UniversalDev, interseccion;
	    
	    public void ISet(int inSet){
	        Factory<String> factory=new Factory<String>();
	        JavaDev = factory.getFactory(inSet);
	        WebDev = factory.getFactory(inSet);
	        CelularesDev = factory.getFactory(inSet);
	        UniversalDev = factory.getFactory(inSet);
	        interseccion = factory.getFactory(inSet);
	        
	    }
	    
	    public void ingresarPersona(String nombre, int especialidad){
		switch( especialidad){
			case 1:
				JavaDev.add(nombre);
	                        break;
			case 2:
				WebDev.add(nombre);
	                    break;
			case 3:
				CelularesDev.add(nombre);
	                    break;
	}
	        
	    }

	    public void imprimir(Set conjunto){
		String[] arreglo=new String[conjunto.size()];
	        arreglo=(String[])conjunto.toArray(new String[0]);
		for(int i=0;i<conjunto.size();i++){
	            System.out.println(arreglo[i]);
		}

	}
	    
	    public void interseccion(boolean java, boolean web, boolean cel){
		if(java && web && cel){
	        interseccion=JavaDev;
			interseccion.retainAll(WebDev);
			interseccion.retainAll(CelularesDev);
			System.out.println("Las personas que trabajan en las tres áreas son: \n");
			imprimir(interseccion);
		}else if(java && web){
			interseccion=JavaDev;
	                interseccion.retainAll(WebDev);
			System.out.println("Las personas que trabajan en Java y Web son: \n");
			imprimir(interseccion);
		}else if(java && cel){
			interseccion=JavaDev;
	                interseccion.retainAll(CelularesDev);
			System.out.println("Las personas que trabajan en Java y Celulares son: \n");
			imprimir(interseccion);
		}else if(web && cel){
			interseccion=WebDev;
	                interseccion.retainAll(CelularesDev);
			System.out.println("Las personas que trabajan en Celulares y Web son: \n");
			imprimir(interseccion);
		}
		
		
	    }
	    
	    public void subconjunto(){
		boolean vacio;

		UniversalDev = JavaDev;
		UniversalDev.removeAll(WebDev);
		vacio = UniversalDev.isEmpty();

		if(vacio == true){
			System.out.println("El conjunto de desarrolladores Java SI es subconjunto de desarrolladores Web");
	        }
	        else{
	                System.out.println("El conjunto de  desarrolladores Java No es subconjunto de desarrolladores Web");
	        }
		
	    }
	    
	    public void masGrande(){
		int tamanio1;
		int tamanio2;
	        int tamanio3;
	 
		tamanio1 = JavaDev.size();
		tamanio2 = WebDev.size();
		tamanio3 = CelularesDev.size();

		if (tamanio1 > tamanio2 && tamanio1 > tamanio3){
	            System.out.println("El Conjunto mas grande es desarrolladores Java");
	            imprimir(JavaDev);
	        }
	        else{
	            if(tamanio2 > tamanio1 && tamanio2 > tamanio3){
	                System.out.println("El Conjunto mas grande es desarrolladores Web");
	                imprimir(WebDev);
	            }
	            else{
	                System.out.println("El Conjunto mas grande es desarrolladores Celulares"); 
	                imprimir(CelularesDev);
	            }
	            
	        }
	    }
	    
	}



