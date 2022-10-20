package rohidas;
import java.util.Scanner;
public class Assignment1 {
		public static void main(String[] args) {
					// TODO Auto-generated method stub
					Scanner obj = new Scanner(System.in);
					   System.out.println("enter the Roll no");
					   int x = obj.nextInt();  
					   if(x%4==1)
					   {
						   System.out.println("Emerld");
						}
					   else if(x%4==2)
					   {
							   System.out.println("ruby");
							}
					   else if(x%4==3)
					   {
								   System.out.println("Perl");
							}
					   if(x%4==0)
					   {
								   System.out.println("saphire");
							}

						}


}
