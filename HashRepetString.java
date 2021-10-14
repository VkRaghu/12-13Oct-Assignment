package string;
import java.util.HashMap;

public class HashRepetString {
	public static void main(String[] args) {
		String str = "aaabbbcccddeeeffffksacd";
		HashMap<Character, Integer> sc= new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(sc.containsKey(c)) {
				int number = sc.get(c);
				number++;
				sc.put(c, number);
			}
			else {
				sc.put(c, 1);
			}
		}
		int max=0;
		char maxChar='0';
		for(Character number : sc.keySet()) {
			if(max<sc.get(number)) {
				max=sc.get(number);
				maxChar=number;
			}
		}
		System.out.println(maxChar+"-"+max);
	}

}
