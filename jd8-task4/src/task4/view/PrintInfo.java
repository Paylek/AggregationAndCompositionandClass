package task4.view;

import task4.bean.BankAccount;
import task4.bean.Customer;

public class PrintInfo {
public void printCustomer(Customer customer) {
		
		System.out.println(customer);
		
	}
	
	public void printSum(int sum) {
		
		System.out.println("����� �� ������ " + sum);
	}
	
	public void printAccount(BankAccount account) {
		
		System.out.println(account);
	}
}
