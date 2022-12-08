import java.util.ArrayList;
import java.util.Iterator;

public class IteratorString {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Virat");
		al.add("Rohit");
		al.add("KL Rahul");
		al.add("Surya");
		al.add("Hardik");
		al.add("DK");
		
		Iterator<String> i = al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
