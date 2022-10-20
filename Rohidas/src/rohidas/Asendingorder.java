package rohidas;
import java.util.Arrays;
public class Asendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String[] A= {"this","is","easiest","example"};  
				//logic for sorting String    
				for(int i=0;i<A.length;i++) 
				  { 
				  for(int j=i+1;j<A.length;j++) 
				  { 
				  if(A[i].length()>A[j].length()) 
				  { 
				  String temp= A[i]; 
				  A[i]=A[j]; 
				  A[j]=temp; 
				}  
				}  
				}  
				//prints the sorted array in ascending order  
			System.out.println(Arrays.toString(A));  
				}  
				} 
	
