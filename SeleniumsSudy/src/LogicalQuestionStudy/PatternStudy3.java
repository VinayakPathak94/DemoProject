package LogicalQuestionStudy;

public class PatternStudy3 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****

		
		int star=1; 
		
		for(int i=1;i<=5;i++)//for row
		{
			for(int j=1;j<=star;j++)//for column
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		System.out.println("====================================");
//		*****
//		****
//		***
//		**
//		*
		int star1=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			star1--;
			System.out.println();
		}
		System.out.println("===================================");
	  //*****
	 //  ****
	 //   ***
	 //    **
	 //     *
	//rows=5,column max/Star=5,space=0
		int star3=5;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star3;k++)
			{
				System.out.print("*");
			}
			space++;
			star3--;
			System.out.println();
		}
		System.out.println("===================================");
//		  *
//	     * *
//	    * * *
//	   * * * *
//	  * * * * *
         int star4=1;
         int space2=5;
         for(int i=1;i<=5;i++)
         {
        	 for(int j=1;j<=space2;j++)//1St we need space
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=1;k<=star4;k++)
        	 {
        		 System.out.print(" *");
        	 }
        	 star4++;
        	 space2--;
        	 System.out.println();
         }
         System.out.println("===================================");
         
         int star5=5;
        //total rows=9,total star=5
         for(int i=1;i<=9;i++) //i=1
         {
        	 for(int j=1;j<=star5;j++)
        	 {
        		 System.out.print(" *");
        	 }
        	 System.out.println();
        	 if(i<5)
        	 {
        		 star5--;
        	 }
        	 else
        	 {
        		 star5++;
        	 }
         }
} 
}
