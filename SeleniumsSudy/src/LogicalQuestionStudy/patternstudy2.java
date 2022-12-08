package LogicalQuestionStudy;

public class patternstudy2 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
		for(int i=1;i<=5;i++) //i=1;j=1
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
       System.out.println("===================================================================");        
//		*****
//		****
//		***
//		**
//		*
		for(int i=1;i<=5;i++) //i=1,j=5                                                                 
		{
			for(int j=5;j>=i;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		 System.out.println("===================================================================");     
		
        
//		  *
//       **
//		*** 
//	   ****
//	  *****
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
		 System.out.println("===================================================================");     
//		 *****
//		  ****
//		   ***
//		    **
//		     *
		 for(int i=1;i<=5;i++)
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
		 System.out.println("===================================================================");   
		 
//		     * 
//		    * * 
//		   * * * 
//		  * * * * 
//		 * * * * * 

		 for(int i=1;i<=5;i++)
		 {
			 for(int j=5;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 System.out.println("===================================================================");
		 
//		 * * * * * 
//		  * * * * 
//		   * * * 
//		    * * 
//		     * 

		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=5;k>=i;k--)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 System.out.println("===================================================================");
//		 * * * * * 
//		 * * * * 
//		 * * * 
//		 * * 
//		 * 
//		 * * 
//		 * * * 
//		 * * * * 
//		 * * * * * 
		 int star=5;
		 for(int i=1;i<=9;i++)
		 {
			 for(int j=1;j<=star;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
			 if(i<5)
			 {
				 star--;
			 }
			 else
			 {
				 star++;
			 }
		 }
		 System.out.println("===================================================================");
//		*
//		 *
//		  *
//		   *
//		    *
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 if(i>=2 & j<=i-1)
				 {
					 System.out.print(" ");
				 }
				 else
				 {
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
		 System.out.println("===================================================================");
		
	 }
	}


