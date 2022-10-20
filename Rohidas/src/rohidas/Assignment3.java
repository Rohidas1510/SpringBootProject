package rohidas;
import java.util.Scanner;
public class Assignment3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				 System.out.println("Enter angle A =");
				int   a=sc.nextInt();
						  
				System.out.println("Enter angle B = ");
				 int   b=sc.nextInt();
						  
				 System.out.println("Enter angle C =");
				 int c=sc.nextInt();
				 int n=a+b+c;
				 System.out.println( n );
				if(n ==180)
				  {
				 if(a==90 || b==90 || c==90){
				 System.out.println("2nd Prize");
				} 
				 System.out.println("1st Prize");
				 }
				else 
				 {
				 System.out.println("Not a Prize");
				}    
	}

}
