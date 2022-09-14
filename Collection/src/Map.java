import java.util.HashMap;
import java.util.Set;
/**
*Datta sanap
*/
public class Map {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> mapping =new HashMap<Integer,String>();
		
		mapping.put(1, "datta");
		mapping.put(2, "sanap");
		mapping.put(3, "tushar");
		mapping.put(0, "sagar");
		mapping.put(1,"datta");
		
		Set<Integer> keys=mapping.keySet();
		
		for(int key:keys)
			System.out.println(key+" "+mapping.get(key));
	}

}
