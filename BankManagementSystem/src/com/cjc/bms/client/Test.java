package com.cjc.bms.client;
import java.util.*;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;

public class Test {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Rbi bank=new Sbi();
		while(true) {
		System.out.println("1.Create Account");
		System.out.println("2.Display all details");
		System.out.println("3.Deposit Money");
		System.out.println("4.Withdrawal");
		System.out.println("5.Balance Check"); 
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			bank.createAccount();
			break;
		case 2:
			bank.displayAllDetail();
			break;
		case 3:
			bank.depositeMoney();
			break;
		case 4:
			bank.withdrawal();
			break;
		case 5:
			bank.balanceCheck();
			break;
		default:
			System.out.println("Invalide choice");
		
		}
		
	}

}
}
