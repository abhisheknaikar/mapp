import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Launch {

	public static void main(String[] args) {
		
		Employee e1= new Employee(10,"Abhishek",27,"Bengaluru",25000);
		Employee e2= new Employee(20,"Arun",29,"mumbai",35000);
		Employee e3= new Employee(30,"Akash",25,"channai",20000);
		
		HashMap hm = new HashMap();
		//LinkedHashMap hm = new LinkedHashMap();
		//TreeMap hm = new TreeMap();
		hm.put(1,e1);
		hm.put(3,e2);
		hm.put(2,e3);
		
		System.out.println(hm);
	}

}
