import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy2 {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		//Size()
		System.out.println(al.size());
		
		//Contains()
		System.out.println(al.contains(60));
		System.out.println(al.contains(20));
		
		//get()
		System.out.println(al.get(2));
		System.out.println(al.get(0));
		//System.out.println(al.get(7));
		
		//Indexof()
		System.out.println(al.indexOf(50));
		System.out.println(al.indexOf(30));
		
		//isEmpty()
		System.out.println(al.isEmpty());
		
		//remove()
		System.out.println(al.remove(3));
		System.out.println(al);
		
		//======================================================================================
		System.out.println("=============================For Static loop========================================");
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(al.get(i));
		}
		//======================================================================================
	System.out.println("=============================For Dynamic loop========================================");
				
	for(int j=0;j<=al.size()-1;j++)
	{
		System.out.println(al.get(j));
	}
	//======================================================================================
			System.out.println("=============================For Each loop========================================");
			
		for(Integer b:al)
		{
			System.out.println(b);
		}
		//======================================================================================
				System.out.println("=============================Iterator========================================");
				
				Iterator<Integer> it = al.iterator();
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
					
	}

}
