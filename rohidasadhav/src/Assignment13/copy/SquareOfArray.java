package Assignment13.copy;

//declaring class
public class SquareOfArray 
{
	//declaring method
	private static boolean PerfectSqrArr(int[]arr) 
	{
		int abc=0,n=0;

		//using for loop
		for(int i=0;i<arr.length;i++) 
		{
			abc=(int)Math.sqrt(arr[i]); 
			abc=n*n;

			//using if statement
			if(abc!=arr[i]) 
			{
				return false; //for output
			}
		}

		return true; //for output

	} //end of method

	// calling main method
	public static void main(String[] args) 
	{

		//ArrayList
		int[]arr= {16,144,169,224}; 

		//using if-else statement
		if( PerfectSqrArr(arr))  
		{
			System.out.println(" Array is perfect square array."); //for printing output
		}
		else 
		{
			System.out.println(" Array is not a Perfect square array ."); //for printing output
		}

	} //end of main method
} //end class of SquareOfArray 
