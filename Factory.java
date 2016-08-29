import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Factory<E> {

	 public Set getFactory(int x){
		 
		 if(x == 0){
			 return new HashSet<E>();
		 }
		 if(x == 1){
			 return new TreeSet<E>();
		 }
		 if(x == 2){
			 return new LinkedHashSet<E>();
		 }
		return null;  
	 }   
}
