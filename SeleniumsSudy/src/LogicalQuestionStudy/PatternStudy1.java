package LogicalQuestionStudy;

public class PatternStudy1 {

	public static void main(String[] args) {
	
//		
//		for(int i=0;i<=5;i++)
//		{
//		  System.out.print(" * ");
//		}
//		for(int i=0;i<=5;i++)
//		{
//			System.out.println(" * ");   
//		}
//		for(int i=0;i<=6;i++)
//		{
//			System.out.print(" * ");   
//		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
