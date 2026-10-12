package com.cjc.bms.serviceImpl;
import java.util.*;

import com.cjc.bms.model.Account;
import com.cjc.bms.service.Rbi;

public class Sbi implements Rbi {

	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	public void createAccount()
	{
		System.out.println("Create Account:-");
		System.out.println("Enter Account Number-");
		a.setAccNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Name-");
		a.setName(sc.nextLine());
		System.out.println("Enter Mobile Number-");
		a.setMobNo(sc.nextLine());
		System.out.println("Enter Adhar Number-");
		a.setAdharNo(sc.nextLine());
		System.out.println("Enter Gender-");
		a.setGender(sc.nextLine());
		System.out.println("Enter Age-");
		a.setAge(sc.nextInt());
		System.out.println("Enter Balance-");
		a.setBalance(sc.nextDouble());
		int Balance=0;
		if(Balance>500)
		{
			a.setBalance(sc.nextDouble());
			
		}
		else
		{
			System.out.println("Enter Sufficent balance ,Amount is greter than 500" );
			
		}
		System.out.println("Account Create Succesfully..!" );
	}
	public void displayAllDetail() 
	{
		System.out.println("||-----Display All Details-----||");
		System.out.println("Account Number :"+a.getAccNo());
		System.out.println("Name :"+a.getName());
		System.out.println("Mobile Number :"+a.getMobNo());
		System.out.println("Adhar Number :"+a.getAdharNo());
		System.out.println("Gender :"+a.getGender());
		System.out.println("Age :"+a.getAge());
		System.out.println("Balance :"+a.getBalance());
	}

	
	public void depositeMoney()
	{
		System.out.println("Enter Amount to deposit :-");
		double amount=sc.nextDouble();
		a.setBalance(a.getBalance()+amount);
		System.out.println("Amount deposit Succesful...");
		System.out.println("Current Balance :"+a.getBalance());
	}

	
	public void withdrawal() 
	{
		System.out.println("Enter Amount to withdraw :-");
		double amount =sc.nextDouble();
		a.setBalance(a.getBalance()-amount);
		System.out.println("Amount withdraw Succesful...");
		System.out.println("Current Balance :-"+a.getBalance());
	}

	
	public void balanceCheck() 
	{
		System.out.println("Current Balance :-"+a.getBalance());
	}

}
