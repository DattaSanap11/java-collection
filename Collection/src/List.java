import java.util.ArrayList;

/**
*Datta sanap
*/
public class List {
	
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		
		
		names.add("kiran");
		names.add("vishal");
		names.add("avdhoot");
		names.add("mahesh");
		names.add("kiran");
		
		for(String name:names)
			System.out.println(name);
		
	}

}
