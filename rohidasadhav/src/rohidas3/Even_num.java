package rohidas3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=new ArrayList<Integer>();
		number.add(30);
		number.add(11);
		number.add(1);
		number.add(15);
		number.add(60);
		
		number.forEach((m)->{
			
			if(m%2==0)
			{
				System.out.println(m);
		}
		

	});

	}}

