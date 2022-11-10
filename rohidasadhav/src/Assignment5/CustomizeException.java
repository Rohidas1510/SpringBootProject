package Assignment5;
import java.util.ArrayList;
import java.util.List;

public class CustomizeException {	
	
			public static void checError(int num)throws Exception
			{
				//List<Integer> number=new ArrayList<>();
				int arr[]= {};
				for(int i=0;i<arr.length;i++) 
				{
					if(arr[i]==0)
					{
					throw new Exception ("Zeromember error");
					}
					else 
					{
					System.out.println("you are welcome");
					}
				}
			}
			public static void main(String[] args) 
			{
				System.out.println("hello world");
				try 
				{
					checError(2);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

		}

	}


