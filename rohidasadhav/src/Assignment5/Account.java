package Assignment5;
import java.io.Serializable;
public class Account implements Serializable
{
 String name;  // private variable
	private Double Balance;

	public Account()   // constructor
	{
		super();
	}
	public String getName()   // getter method
	{
		return name;
	}
	public void setName(String name)  // setter method
	{
		this.name = name;
	}
	public Double getBalance()  // getter method
	{
		return Balance;
	}
	public void setBalance(Double balance) // setter method
	{
		Balance = balance;
	}
	public void withdraw() //method
	{
		double withdrawamt=5000;
		if(Balance<withdrawamt)  // if else statement
		{
		System.out.println("Insufficeint amount");
		}
		else 
		{
			System.out.println("withdraw easily");
		}
		
		Balance=Balance-withdrawamt;
		System.out.println("After withdraw :"+Balance);
	}
	
	public void deposite() //methiod
	{
		double depositeamt=45;
		Balance=Balance+depositeamt;
		System.out.println("After deposite :"+Balance);
	
	}
	
	
}
