import java.util.HashSet;
import java.util.Iterator;
public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet<Object>hs = new HashSet<>();
		
		hs.add("Pune");
		hs.add(123456);
		hs.add('M');
		hs.add(25.26f);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		//hs.clear();
		
		System.out.println(hs.isEmpty());
		
		Object hs1 = hs.clone();
		System.out.println(hs1);
		System.out.println(hs);
		
		System.out.println(hs.contains(123456));
		
		
		System.out.println(hs.remove('M'));
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println("======================For Each Loop=====================================");
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		System.out.println("======================Iteratotr=====================================");
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====================================================================");
		
		
		
		
	
	}

}
