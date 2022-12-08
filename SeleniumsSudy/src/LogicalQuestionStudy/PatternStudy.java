package LogicalQuestionStudy;

public class PatternStudy {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
		
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================================================================");

//		*****
//		****
//		***
//		**
//   	*
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================================================================");
////		*
////		**
////		***
////		****
////		*****
////		*****
////		****
////		***
////		**
////	    *
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================================================================");
//		
//	 	    *  i=1 and our condition is i<=5 condition is true then it goes in nested loop
//    	   **  j=5 condition is j>=i condition is true then it will print 1 space then updation
//   	  ***  j=4 condition is j>=i condition is true then it will print 1 space then updation ...
//  	 ****  when j=0 condition is false then it goes in another loop and will print *
//      *****
//		
		for(int i=1;i<=5;i++) 
		{
			for(int j=5;j>=i;j--)//This loop is used for the space becuase we have to print Space first
				          
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================================================================");
		
//*****       space space space space space star
// ****
//  ***
//   **
//    *
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)//Loop for space
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
		    
		System.out.print("*");
		    
		System.out.println();
		}
		System.out.println("=================================================================");
//		
//     	    *           
//    	   **  
//   	  ***  
//  	 ****  
//      *****
//      *****       
//		 ****
//		  ***
//		   **
//		    *
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	  for(int i=1;i<=5;i++)//i=1,j=1
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=5;k>=i;k--)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  System.out.println("=================================================================================");
//	  
//	      *
//	     * *
//	    * * *
//	   * * * *
//	  * * * * *
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=5;j>=i;j--) 
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print(" *");
		  }
		  System.out.println();
	  }
	  System.out.println("===============================================================================");
// 
//	  * * * * *
//	   * * * *
//	    * * *
//	     * *
//	      *
	  for(int i=1;i<=5;i++) //i=1,
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=5;k>=i;k--)
		  {
			  System.out.print(" *");
		  }
		  System.out.println();
	  }
	  System.out.println("===============================================================================");
//	  
//	      *
//	     * *
//	    * * *
//	   * * * *
//	  * * * * *
//	  * * * * *
//	   * * * *
//	    * * *
//	     * *
//	      *
	  
	  
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=5;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print(" *");
		  }
		  System.out.println();
	  }
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=5;k>=i;k--)
		  {
			  System.out.print(" *");
		  }
		  System.out.println();	  
	  }
	  System.out.println("============================================================================");
	  		
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
    }
	}


