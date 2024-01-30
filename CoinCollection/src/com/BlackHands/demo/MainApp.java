package com.BlackHands.demo;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		Scanner sc=new Scanner(System.in);
		
		CoinCollection cc=new CoinCollection();
		
		while(choice!=11)
		{
			System.out.println("");
			System.out.println("**************************Menu****************************");
			System.out.println("*1:Add Coin                                              *");
			System.out.println("*2:Display Details                                       *");
			System.out.println("*3:Add From File                                         *");
			System.out.println("*4:Search by Country                                     *");
			System.out.println("*5:Search by Year of Minting                             *");
			System.out.println("*6:Search by Current Value Sorted                        *");
			System.out.println("*7:Search by Country + Denomination                      *");		
			System.out.println("*8:Search by Country + Year of Minting                   *");
			System.out.println("*9:Search by Country + Denomination + Year of Minting    *");	
			System.out.println("*10:Search by Acquired Date + Country                    *");
			System.out.println("*11:Exit                                                 *");
			System.out.println("**********************************************************");
			System.out.println("Enter your choice: ");
			
			choice=sc.nextInt();
			switch(choice)
			{
				case 1://add coin 
				{
					cc.addCoin();
				}
				break;
			
				case 2://display
				{
					cc.display();
				}
				break;
			
				case 3://import from csv file
				{
					cc.importData();
				}
				break;
				
				case 4://search coin by country
				{
					cc.searchByCountry();
				}
				break;
				
				case 5://search coin by Year of Minting
				{
					cc.searchByYearOfMinting();
				}
				break;
				
				case 6://search coin by Year of Minting
				{
					cc.sortingCurrentValue();
				}
				break;
				
				case 7://Search by Country + Denomination 
				{
					cc.searchByCountryAndDenomination();
				}
				break;
				
				case 8://Search by Country + Year of Minting 
				{
					cc.searchByCountryAndYearOFMinting();
				}
				break;
				
				case 9://Search by Country + Denomination + Minting
				{
					cc.searchByCountryDenominationMinting();
				}
				break;
				
				case 10://Search by Acquired Date + Country 
				{
					cc.searchByAcquiredDateANdCountry();
				}
				break;
				
				case 11://Exit
				{
					System.out.println("Thank you for visiting us...!");
					System.out.println("Exit Successfully...!");
				}
				break;
			}
		}
		
		

	}

}
