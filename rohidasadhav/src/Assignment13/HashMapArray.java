package Assignment13;

import java.util.HashMap;

//declaring class
public class HashMapArray 
{
	//calling main method
	public static void main(String[] args) 
	{
		//ArrayList
		char[]arr= {'a','c','d','f','a'};

		//creating Hashmap to store count value 
		HashMap <Character,Integer>charCounts = new HashMap<>();

		//using for each loop
		for(char r:arr)
		{
			int count=charCounts.getOrDefault(r,0);
			charCounts.put(r, count+1);
		}

		//using for each loop
			for(char r:charCounts.keySet()) 
			{
				System.out.println(r+":"+charCounts.get(r)); //for printing output
			}

	} //end of main method

} //end class of HashMapArray

