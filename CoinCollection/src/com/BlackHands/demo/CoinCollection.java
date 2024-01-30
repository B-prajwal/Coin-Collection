package com.BlackHands.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoinCollection {
	String country;			//coin belongs to country
	String denomination;	//1rs 2rs 5rs 10rs 20rs coin
	String yearOfMinting;		//In which year coin is made
	double currentValue;		//current value of coin in present year 
	String acquiredYear;		//when collector get the coin
	
	Scanner sc=new Scanner(System.in);
	
	List<Coin>coin;
	  public CoinCollection() {
		// TODO Auto-generated constructor stub
		  coin=new ArrayList<Coin>();
	}
	  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void addCoin()
	{
		System.out.println("Enter Country name of coin: ");
		country=sc.next();
		
		System.out.println("Enter the Coin Denomination");
		denomination=sc.next();
		
		System.out.println("Enter the Year of Minting (In which year coin is made: YYYY)");
		yearOfMinting=sc.next();
		Year year=Year.parse(yearOfMinting);
		
		System.out.println("Enter the Current value of coin: ");
		currentValue=sc.nextDouble();
		
		System.out.println("Enter the Acquired Date of coin (YYYY-MM-DD):");
		acquiredYear=sc.next();
		
		LocalDate date=LocalDate.parse(acquiredYear);
		
		coin.add(new Coin(country,denomination,yearOfMinting,currentValue,acquiredYear));
		coin.get(coin.size()-1);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void display()
	{
		int flag=0;
		for(int ctr=0;ctr<coin.size();ctr++)
		{
			System.out.println("");
			System.out.print("Country: "+coin.get(ctr).country);
			System.out.print("\tDenomination: "+coin.get(ctr).denomination);
			System.out.print("\tYear of minting: "+coin.get(ctr).yearOfMinting);
			System.out.print("\tCurrent value : "+coin.get(ctr).currentValue);
			System.out.print("\tAcquired Year: "+coin.get(ctr).acquiredYear);
			flag=1;
			//System.out.println("**********************************************************************************************");
		}
		
		if(flag==0)
		{
			System.out.println("No Data to display...!");
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	public void importData()
	{
		Scanner sc;
		try {
			sc = new Scanner(new File("coin.csv"));
			sc.nextLine();
			System.out.println("");
			System.out.println("");
			System.out.println("*****************************************************************************");
			System.out.println("*                                Coin Details                               *");
			System.out.println("*****************************************************************************");
			while(sc.hasNext())
			{
				String line=sc.nextLine();
				System.out.println(line);
				String[ ]arr=line.split(",");
				System.out.println("*****************************************************************************");
				String country= arr[0];
				String denomination =arr[1];
				String yearOfMinting=arr[2];
				double currentValue = Double.parseDouble(arr[3]);
				String acquiredYear=arr[4];
				
				coin.add(new Coin(country,denomination,yearOfMinting,currentValue,acquiredYear));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void searchByCountry()
	{
		int flag=0;
		String country;
		System.out.println("Coin Collection by Country Name");
		System.out.println("Enter the country name: ");
		country=sc.next();
		
		for(int ctr=0;ctr<coin.size();ctr++)
		{
			if(coin.get(ctr).getCountry().equalsIgnoreCase(country))
			{
				System.out.print("Country: "+coin.get(ctr).country);
				System.out.print("\tDenomination: "+coin.get(ctr).denomination);
				System.out.print("\tYear of minting: "+coin.get(ctr).yearOfMinting);
				System.out.print("\tCurrent value : "+coin.get(ctr).currentValue);
				System.out.print("\tAcquired Year: "+coin.get(ctr).acquiredYear);
				System.out.println("");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry data is not available...!");
		}
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void searchByYearOfMinting()
	{
		int flag=0;
		String yearOfMinting;
		System.out.println("Coin Collection by Country Name");
		System.out.println("Enter the Year of Minting (In which year coin is made: YYYY): ");
		yearOfMinting=sc.next();
		
		for(int ctr=0;ctr<coin.size();ctr++)
		{
			if(coin.get(ctr).getYearOfMinting().equals(yearOfMinting))
			{
				System.out.print("Country: "+coin.get(ctr).country);
				System.out.print("\tDenomination: "+coin.get(ctr).denomination);
				System.out.print("\tYear of minting: "+coin.get(ctr).yearOfMinting);
				System.out.print("\tCurrent value : "+coin.get(ctr).currentValue);
				System.out.print("\tAcquired Year: "+coin.get(ctr).acquiredYear);
				System.out.println("");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry data is not available...!");
		}
		
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void searchByCountryAndDenomination()
	{
		int flag=0;
		String country,denomination;
		System.out.println("Coin Collection by Country Name and Denomination");
		System.out.println("Enter the country name: ");
		country=sc.next();
		
		System.out.println("Enter the Denomination: ");
		denomination=sc.next();
		
		for(int ctr=0;ctr<coin.size();ctr++)
		{
			if((coin.get(ctr).getCountry().equals(country)) && (coin.get(ctr).getDenomination().equals(denomination)))
			{

				System.out.print("Country: "+coin.get(ctr).country);
				System.out.print("\tDenomination: "+coin.get(ctr).denomination);
				System.out.print("\tYear of minting: "+coin.get(ctr).yearOfMinting);
				System.out.print("\tCurrent value : "+coin.get(ctr).currentValue);
				System.out.print("\tAcquired Year: "+coin.get(ctr).acquiredYear);
				System.out.println("");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry data is not available...!");
		}
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void searchByCountryAndYearOFMinting()
	{
		int flag=0;
		String country,yearOfMinting;
		System.out.println("Coin Collection by Country Name and Year of Minting");
		System.out.println("Enter the country name: ");
		country=sc.next();
		
		System.out.println("Enter the Year of Minting (In which year coin is made: YYYY): ");
		yearOfMinting=sc.next();
		
		for(int ctr=0;ctr<coin.size();ctr++)
		{
			if((coin.get(ctr).getCountry().equals(country)) && (coin.get(ctr).getYearOfMinting().equals(yearOfMinting)))
			{
				System.out.print("Country: "+coin.get(ctr).country);
				System.out.print("\tDenomination: "+coin.get(ctr).denomination);
				System.out.print("\tYear of minting: "+coin.get(ctr).yearOfMinting);
				System.out.print("\tCurrent value : "+coin.get(ctr).currentValue);
				System.out.print("\tAcquired Year: "+coin.get(ctr).acquiredYear);
				System.out.println("");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry data is not available...!");
			display();
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void searchByCountryDenominationMinting()
	{
		int flag=0;
		String country,yearOfMinting,denomination;
		System.out.println("Coin Collection by Country Name,Denomination and Year of Minting ");
		
		System.out.println("Enter the country name: ");
		country=sc.next();
		
		System.out.println("Enter Denomination");
		denomination=sc.next();
		
		System.out.println("Enter the Year of Minting (In which year coin is made: YYYY): ");
		yearOfMinting=sc.next();
		
		for(int ctr=0;ctr<coin.size();ctr++)
		{
			if((coin.get(ctr).getCountry().equals(country)) && (coin.get(ctr).getDenomination().equals(denomination)) && (coin.get(ctr).getYearOfMinting().equals(yearOfMinting)))			
			{
				System.out.print("Country: "+coin.get(ctr).country);
				System.out.print("\tDenomination: "+coin.get(ctr).denomination);
				System.out.print("\tYear of minting: "+coin.get(ctr).yearOfMinting);
				System.out.print("\tCurrent value : "+coin.get(ctr).currentValue);
				System.out.print("\tAcquired Year: "+coin.get(ctr).acquiredYear);
				System.out.println("");
				flag=1;
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry data is not available...!");
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void searchByAcquiredDateANdCountry()
	{
		int flag=0;
		String country,acquiredDate;
		System.out.println("Coin Collection by Acquired Date and Country Name ");
		
		System.out.println("Enter the Acquired Date of coin (YYYY-MM-DD):");
		acquiredDate=sc.next();
		
		System.out.println("Enter the country name: ");
		country=sc.next();
		
		for(int ctr=0;ctr<coin.size();ctr++)
		{
			if((coin.get(ctr).getAcquiredYear().equalsIgnoreCase(acquiredDate)) && (coin.get(ctr).getCountry().equals(country)))
			{
				System.out.print("Country: "+coin.get(ctr).country);
				System.out.print("\tDenomination: "+coin.get(ctr).denomination);
				System.out.print("\tYear of minting: "+coin.get(ctr).yearOfMinting);
				System.out.print("\tCurrent value : "+coin.get(ctr).currentValue);
				System.out.print("\tAcquired Date: "+coin.get(ctr).acquiredYear);
				System.out.println("");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry data is not available...!");
		}
		
		
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void sortingCurrentValue()
	{
		List<Coin>Currency=coin.stream().
				sorted(Comparator.comparingDouble(Coin::getCurrentValue)).
				collect(Collectors.toList());
		for(Coin c:Currency)
		{
			c.display();
		}
	}
	

}
