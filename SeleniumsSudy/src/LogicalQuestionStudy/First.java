package LogicalQuestionStudy;

public class First {

	public static void main(String[] args) {
		//If we have to print following pattern
		//*
	    //*
	    //*
		//*
		//*
		//Then what procedure we need to follow
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("*");
		}
		System.out.println("===========================================================");
		//======================================================================================================
	
	//If we have to print following pattern what procedure you will follow
				//*****
		for(int i=0;i<=5;i++)
		{
			System.out.print("*");		
		}
		
			System.out.println();
		System.out.println("=========================================================");
//		//================================================================================================
//		
//		//If we have to print following pattern then what procedure we will follow
//		//*****
//		//*****
//		//*****
//		//*****
//		//*****
//		
//		//row-->5 columns-->5
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========================================================");
//		//================================================================================================
//		
//		//If we have to print following pattern then what procedure we will follow
//		//*
//		//**
//		//***
//		//****
//		//*****
		//Max no.of Rows-->5
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)//star=1 //We took j=1 because there is no '*'in first column,first '*'is considered in a row
				                    //So we need updation from 1st row
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		System.out.println("=========================================================");
//		//================================================================================================
//		
		//If we have to print following pattern then what procedure we will follow
				//*****
				//****
				//***
				//**
				//*
				//Max no.of Rows-->5
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
				System.out.println("=========================================================");
//				//================================================================================================
//				
//				
				//If we have to print following pattern then what procedure we will follow 
				// *****
				//  ****
				//   ***
				//    **
				//     *
				//Max no.of Rows-->5
				//no.of column/star is-->5
				
				int star2=5;
				int space=0;
				
				for(int i=0;i<=5;i++)//For row
				{
					for(int j=0;j<=space;j++)//For loop foe space
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star2;k++) // For loop for the star
						{
							System.out.print("*");
						}
					System.out.println();
					star2--;
					space++;
				}
				System.out.println("=========================================================");
				//================================================================================================
//				
//				//If we have to print following pattern then what procedure we will follow
//				//     *
//				//    **
//				//   ***
//				//  ****
//				// *****
				//Max no.of Rows-->5
			//no.of column/star is-->5
				
				
				int star3=1;
				int space3=4;
				
				for(int i=0;i<=5;i++)//Outer loop for row
				{
					//1ST we need space so 
					for(int j=0;j<=space3;j++)//Loop for space
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star3;k++)//Loop for column
					{
						System.out.print("*");
					}
					System.out.println();
				space3--;
				
					star3++;
				}
				
		
	}
	}

