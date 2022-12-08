import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFloat {

	public static void main(String[] args) {
		
		ArrayList<Float> al=new ArrayList<Float>();
		
		al.add(10.5f);
		al.add(20.2f);
		al.add(30.20f);
		al.add(40.9f);
		al.add(50.8f);
		
		Iterator<Float> i = al.iterator();
		
		//While(condition)
//		{
			//Body Of the loop
			//Updation
//		}
		
	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
