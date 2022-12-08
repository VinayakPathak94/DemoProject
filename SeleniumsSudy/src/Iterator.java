import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		    java.util.Iterator<Integer> i = al.iterator();
		    
		    while(i.hasNext())
		    {
		    	System.out.println(i.next());
		    }
		    System.out.println("=======================================");
		    
		ListIterator<Integer> i1 = al.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
