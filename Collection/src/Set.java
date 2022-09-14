import java.util.HashSet;

/**
*Datta sanap
*/
public class Set {
	
	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
		
        names.add("sagar");
		names.add("kiran");
		names.add("vishal");
		names.add("avdhoot");
		names.add("mahesh");
		names.add("kiran");
		names.add(" ");
		
		System.out.println(names);
	}

}
