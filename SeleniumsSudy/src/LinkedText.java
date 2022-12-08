import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LinkedText {

	public static void main(String[] args) {

		LinkedList<String> li=new LinkedList<String>();
		
		li.add("String");
		li.add("Vinayak");
		li.add("Vijay");
		li.add("Onkar");
		li.add("Akash");
		li.add("Viraj");
		li.add("Nitin");
		li.add("Sharad");
		li.add("Vijay");
		
		System.out.println(li);
		
//		//get(index);
       System.out.println(li.get(3));
       System.out.println(li.get(7));
//		
//       //getFirst();
         System.out.println(li.getFirst());
         System.out.println(li.getLast());
//       
//       //element();
          System.out.println(li.element());
          System.out.println(li);
//       
//       //getLast();
          System.out.println(li.getLast());
//       
//       //Contains():
        System.out.println(li.contains("Kiran"));
        System.out.println(li.contains("Onkar"));
//       
//       //Capacity();
         //System.out.println(li.capacity()); not support Because LinkedList has no default capacity();
//       
        //Size();
        System.out.println(li.size());
//       
//       //offerfirst();
       System.out.println(li.offerFirst("Velocity"));
       System.out.println(li);
//       
//       //offerlast();
         System.out.println(li.offerLast("Pune"));
         System.out.println(li);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       //peek();         //Retrive the data and 
       System.out.println(li.peek());
       System.out.println(li);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       //peekfirst();
       System.out.println(li.peekFirst());
        System.out.println(li);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       
//       //peeklast();
     System.out.println(li.peekLast());
       System.out.println(li);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       //poll();
      System.out.println(li.poll());
       System.out.println(li);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       //pollfirst();
       System.out.println(li.pollFirst());
       System.out.println(li);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       //polllast();
        System.out.println(li.pollLast());
        System.out.println(li); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       
//       //pop();
       System.out.println(li.pop());
        System.out.println(li);
      System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       //set();Replace the given index
       System.out.println(li.set(0, "Vinayak"));
       System.out.println(li);
       System.out.println(li.set(2, "Kiran"));
       System.out.println(li);
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//       
//       
       //For Each
         for(String a:li)
         {
        	 System.out.println(a);
         }System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//         
//         
//
//         //For loop
         for(int i=0;i<=6;i++)
         {
        	 System.out.println(li.get(i));
         }System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//         
        //Iterator
         Iterator<String> it = li.iterator();
//         
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//         
//         
         //ListIterator
         ListIterator<String> it1 = li.listIterator();
        while(it1.hasNext())
        {
        	System.out.println(it1.next());
        }System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//        
        
	}

}
