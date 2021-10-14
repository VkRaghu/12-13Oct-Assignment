package string;
import java.util.HashMap;

public class HashMapString {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Vikash");
		hm.put(2, "Vishal");
		hm.put(3, "Atul");
		hm.put(4, "Vijay");
		hm.put(5, "Vikash");
		for(Integer key : hm.keySet()) {
			System.out.println(key+" "+hm.get(key));
		}
	}

}
