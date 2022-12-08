import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorStudy3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Virat");
		al.add("Rohit");
		al.add("KL Rahul");
		al.add("Surya");
		
		System.out.println(al);
		
		Iterator<String> it = al.iterator();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		ListIterator<String> it1 = al.listIterator();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
