package Assignment6;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(1, 3);
		hm.put(2, 5);
		hm.put(3, 7);
		hm.put(4, 19);
		hm.put(5, 24);
		hm.put(6, 37);
		hm.put(7, 47);
		hm.put(8, 65);
		hm.put(9, 88);
		hm.put(10, 100);
		hm.put(11, 126);
		hm.put(12, 154);
		hm.put(13, 154);
		hm.put(14, 197);
		hm.put(15, 224);
		for(Integer key:hm.keySet())
		{
			System.out.println("Key:"+key+"values:"+hm.get(key));
		}
		

	}

}

