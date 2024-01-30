package com.BlackHands.demo;

public class Coin {
	
	String country;
	String denomination;	//1rs 2rs 5rs 10rs 20rs coin
	String yearOfMinting;		//In which year coin is made
	double currentValue;		//current value of coin in present year 
	String acquiredYear;		//when collector get the coin

	public Coin() {
		// TODO Auto-generated constructor stub
	}

	public Coin(String country, String denomination, String yearOfMinting, double currentValue, String acquiredYear) {
		super();
		this.country = country;
		this.denomination = denomination;
		this.yearOfMinting = yearOfMinting;
		this.currentValue = currentValue;
		this.acquiredYear = acquiredYear;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getYearOfMinting() {
		return yearOfMinting;
	}

	public void setYearOfMinting(String yearOfMinting) {
		this.yearOfMinting = yearOfMinting;
	}

	public double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	public String getAcquiredYear() {
		return acquiredYear;
	}

	public void setAcquiredYear(String acquiredYear) {
		this.acquiredYear = acquiredYear;
	}
	
	public void display()
	{
		System.out.println("");
		System.out.print("Country: "+country);
		System.out.print("\tDenomination: "+denomination);
		System.out.print("\tYear of minting: "+yearOfMinting);
		System.out.print("\tCurrent value : "+currentValue);
		System.out.print("\tAcquired Date: "+acquiredYear);
	}
	
}
