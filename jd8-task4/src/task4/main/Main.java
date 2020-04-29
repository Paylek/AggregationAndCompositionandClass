package task4.main;

import java.util.ArrayList;
import java.util.List;

import task4.bean.BankAccount;
import task4.bean.Customer;
import task4.logic.BankAccountLogic;
import task4.view.PrintInfo;

public class Main {
public static void main(String[] args) {
		
		BankAccountLogic logic = new BankAccountLogic();
		PrintInfo print = new PrintInfo();
		
		BankAccount a1 = new BankAccount(10, 100, true);
		BankAccount a2 = new BankAccount(5, 25, true);
		BankAccount a3 = new BankAccount(7, -10, false);
		BankAccount a4 = new BankAccount(9, 50, true);
		
		
		BankAccount b1 = new BankAccount(24, 1000, true);
		BankAccount b2 = new BankAccount(53, -30, true);
		BankAccount b3 = new BankAccount(8, -12, false);
		BankAccount b4 = new BankAccount(11, 55, true);
		
		List<BankAccount> listBankAccount1 = new ArrayList<BankAccount>();
		List<BankAccount> listBankAccount2 = new ArrayList<BankAccount>();
		
		listBankAccount1.add(a1);
		listBankAccount1.add(a2);
		listBankAccount1.add(a3);
		listBankAccount1.add(a4);
		
		listBankAccount2.add(b1);
		listBankAccount2.add(b2);
		listBankAccount2.add(b3);
		listBankAccount2.add(b4);
		
		Customer ivanov = new Customer("Иван", "Иванов", listBankAccount1);
		Customer sidorov = new Customer("Семен", "Сидоров", listBankAccount2);
		
		print.printAccount(logic.findAccount(ivanov, 10));
		
		logic.blockAccount(sidorov, 53, false);
		
		print.printCustomer(sidorov);
		
		print.printCustomer(logic.sortAccount(ivanov));
		
		print.printSum(logic.sumAccount(sidorov));
		
		print.printSum(logic.sumPositiveBalanceAccount(sidorov));
		
		print.printSum(logic.sumNegativeBalanceAccount(sidorov));
		

	}
}
