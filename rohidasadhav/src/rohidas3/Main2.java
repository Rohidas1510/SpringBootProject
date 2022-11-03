package rohidas3;
import java.util.ArrayList;
import java.util.List;
interface Adder{
	public int add(int a,int b);
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adder d=(x,y)->
{
	return x+y;
};
System.out.println(d.add(10, 20));
System.out.println();
List<String> upper = getUpper();

upper.stream()
        .map((p) -> p.toUpperCase())
        .sorted()
        .forEach((p) -> System.out.println(p));
}

	// create an object of list using ArrayList
    static List<String> places = new ArrayList<>();


    public static List getUpper(){

   
     
        places.add("pune");
      
        return places;
    }


}
