package task4.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import task4.bean.BankAccount;
import task4.bean.Customer;

public class BankAccountLogic {
public BankAccount findAccount(Customer customer, int bankAccount) {
		
		BankAccount account = null;
		
		for(BankAccount c : customer.getListAccount()) {
			
			if(c.getBankAccount() == bankAccount) {
				
				account = c;
			}
			
		}
		
		return account;
	}
	
	public Customer sortAccount(Customer customer) {
		
		List<BankAccount> sortList = new ArrayList<BankAccount>();
		
		sortList = customer.getListAccount(); 
		
		Collections.sort(sortList, new Comparator<BankAccount>() {
			public int compare(BankAccount o1, BankAccount o2) {
				return o1.getBankAccount() > o2.getBankAccount() ? -1 : (o1.getBankAccount() < o2.getBankAccount()) ? 1 : 0;
			}
		});
		
		customer.setListAccount(sortList);
			
		return customer;
		}
			
	public void blockAccount(Customer customer, int bankAccount, boolean status) {
		
		for(BankAccount c : customer.getListAccount()) {
			
			if(c.getBankAccount() == bankAccount) {
				
				c.setAccountStatus(status);
			}
		}
	}
	
	public int sumAccount(Customer customer) {
		
		int sum = 0;
		
		for(BankAccount c : customer.getListAccount()) {
			sum = sum + c.getAmountOfMoney();
		}
		
		return sum;
		
	}
	
	public int sumPositiveBalanceAccount(Customer customer) {
		
		int sum = 0;
		
		for(BankAccount c : customer.getListAccount()) {
			if(c.getAmountOfMoney() >= 0) {
				
				sum = sum + c.getAmountOfMoney();
			}
		}
		
		return sum;
	}
	
	public int sumNegativeBalanceAccount(Customer customer) {
		
		int sum = 0;
		
		for(BankAccount c : customer.getListAccount()) {
			if(c.getAmountOfMoney() < 0) {
				
				sum = sum + c.getAmountOfMoney();
			}
		}
		
		return sum;
	}
}
