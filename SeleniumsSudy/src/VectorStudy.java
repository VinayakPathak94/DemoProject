import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<>();
		
		v.add("Komal");
		v.add("Shilpa");
		v.add("Kiran");
		v.add("null");
		v.add(null);
		v.add("Vinayak");
		
		System.out.println(v);
		
//		//get()
		System.out.println(v.get(3));
        System.out.println(v.get(2));
        System.out.println(v.get(0));
//		
//		//Remove()
		System.out.println(v.remove(3));
		System.out.println(v);
//		
//		//contains()
 		System.out.println(v.contains(null));
//		
//		//capacity
		System.out.println(v.capacity());// Default Capacity of vector is 10
//		
//		//size()
		System.out.println(v.size());
//		
//		//For Loop
		System.out.println("==============================For loop========================================");
//		
		for(int i=0;i<=4;i++)
		{
			System.out.println(v.get(i));
		}
//		
//		//For Each loop
		System.out.println("============================For each loop==========================================");
//		
		for(String b:v)
		{
			System.out.println(b);
		}
//		
//		//Iterator
		System.out.println("=============================Iterator===================================");
//		
		Iterator<String> it = v.iterator();
//		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//		
//		//ListIterator
		System.out.println("===========================List iterator===============================================");
//		
		Iterator<String> it1 = v.iterator();
//		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
//		
//		//Enumeration
		System.out.println("============================Enumeration==============================================");
//		
		Enumeration<String> en = v.elements();
//		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
//			
//		
	}

}
