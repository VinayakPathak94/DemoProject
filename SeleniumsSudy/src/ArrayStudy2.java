import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayStudy2 {

	public static void main(String[] args) {
	
	ArrayList<Character> a1=new ArrayList<Character>();
	
	a1.add('A');
	a1.add('B');
	a1.add('C');
	a1.add('D');
	a1.add('E');
	a1.add('D');
	a1.add('E');
	a1.add('F');
	
	System.out.println(a1);
	System.out.println("================================================================================");
	
	System.out.println(a1.get(0));
	System.out.println(a1.get(1));
	System.out.println(a1.get(2));
	System.out.println(a1.get(3));
	System.out.println(a1.get(4));
	System.out.println(a1.get(5));
	System.out.println(a1.get(6));
	System.out.println(a1.get(7));
	System.out.println("================================================================================");

	System.out.println("=========================For loop Static=====================================");
	
	for(int i=0;i<=7;i++)
	{
		System.out.println(a1.get(i));
	}
	System.out.println("=========================For loop Dynamic=====================================");
	
	for(int j=0;j<=a1.size()-1;j++)
	{
		System.out.println(a1.get(j));
	}
	System.out.println("===========================For Each loop==================================================");
	
	for(Character b:a1)
	{
		System.out.println(b);
	}
	System.out.println("===========================Iterator==================================================");
	
	Iterator<Character> it = a1.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
	System.out.println("===========================List Iterator==================================================");
	              ListIterator<Character> li = a1.listIterator();
	              
	              while(li.hasNext())
	              {
	            	  System.out.println(li.next());
	              }
	
	
	
	}

	private static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
