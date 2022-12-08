import java.util.ArrayList;

public class ArrayStudy {

	private static final Object True = null;
	private static final Object Pathak = null;
	private static final Object False = null;

	public static void main(String[] args) {
		
		ArrayList<Comparable> al=new ArrayList<Comparable>();//Created object of array list
		
		al.add("Velocity");
		al.add("123");
		al.add('M');
		al.add("145.23f");
		al.add("Velocity");
		al.add(null);   //allows any no of null values
		al.add(null);
        al.add("True");
		al.add("False");
		al.add("Pathak");
		
		//best choice: retrieval operation (random access interface is implemented in arraylist & vector)
		//worst choice: manipulation operation i.e. insertion in between arraylist or delete  ()
		//data structure: Resizable
		//order of insertion-maintain
		System.out.println(al);//Printing Statement to Print AL
		al.add(4,"Vinayak");
		System.out.println(al); //duplicate are allowed in Arraylist
		
		System.out.println(al.size());
		
		System.out.println(al.contains("Pathak"));
		
		System.out.println(al.contains("Pune"));
		
		System.out.println(al.get(6));
		
		System.out.println(al.get(2));
		
		//System.out.println(al.get(15)); Out of bound Exception
		
		System.out.println(al.indexOf("Vinayak"));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.remove(True));
		System.out.println(al);
		
		System.out.println(al.remove(False));
		System.out.println(al);
		
		System.out.println(al.remove(0));
		System.out.println(al);
		//=======================================================================
		System.out.println("=====================================================");
		
		for(Object a:al)
		{
			System.out.println(a);
		}
		//=======================================================================
				System.out.println("============================For Each Loop=======================================");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Virat");
		al1.add("Rohit");
		al1.add("KLRahul");
		al1.add("Surya");
		al1.add("Hardik");
		al1.add("DK");
		al1.add("Rishabh");
		al1.add("Bhuvaneshwar");
		al1.add("Bumrah");
		al1.add("Shardul");
		
		for(Object b:al1)
		{
			System.out.println(b);
		}
		
		
	}

}
