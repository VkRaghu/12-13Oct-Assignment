package string;
import java.util.HashMap;

public class MaxOccurence {
	public static void main(String[] args) {
		String str = "Tit for tat";
		str=str.toLowerCase();
		char []ch = str.toCharArray();
		HashMap<Character,Integer> datamap=new HashMap<Character, Integer>();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				if(datamap.containsKey(ch[i])) {
					Integer value=datamap.get(ch[i]);
					value++;
					datamap.put(ch[i], value);
				}
				else {
					datamap.put(ch[i], 1);
				}
			}
		}
		int max=0;
		char maxChar=0 ;
		for(Character key : datamap.keySet()) {
			if(max<datamap.get(key)) {
				max=datamap.get(key);
				maxChar=key;
			}
		}
		System.out.println("Maximum repeting : "+maxChar +"-"+max);
		int min=Integer.MAX_VALUE;
		char minChar=0;
		for(Character key: datamap.keySet() ) {
			if(min>datamap.get(key)) {
				min=datamap.get(key);
				minChar=key;
			}
		}
		System.out.println("Minimum repeting : "+minChar +"-"+min);
	}

}
