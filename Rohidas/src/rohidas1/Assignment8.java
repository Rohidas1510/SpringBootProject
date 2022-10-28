package rohidas1;

public class Assignment8 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int f=1,j;
	        int i;
	        for(i=101;i<=199;i+=2)
	        //System.out.println(i);
	        {
	            f=1;
	            for(j=3;j<i;j++){
	                if(i%j==0){
	                    //System.out.println(i);
	                    f=0;
	                    break;
	            }
	            }
	            if(f==1)
	            {
	                     System.out.println(i);
	                     f=1;
	            }            

		}

		}
}
