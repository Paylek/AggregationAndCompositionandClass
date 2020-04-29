package task4.bean;

public class BankAccount {
	private int bankAccount;
	private int amountOfMoney;
	private boolean accountStatus;
	
	
	public BankAccount() {
		
	}
	
	public BankAccount(int bankAccount, int amountOfMoney, boolean status) {
		
		this.bankAccount = bankAccount;
		this.amountOfMoney = amountOfMoney;
		this.accountStatus = status;
		
	}
	
	public int getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	public int getAmountOfMoney() {
		return amountOfMoney;
	}
	public void setAmountOfMoney(int amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}
	public boolean isAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accountStatus ? 1231 : 1237);
		result = prime * result + amountOfMoney;
		result = prime * result + bankAccount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountStatus != other.accountStatus)
			return false;
		if (amountOfMoney != other.amountOfMoney)
			return false;
		if (bankAccount != other.bankAccount)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BankAccount [bankAccount=" + bankAccount + ", amountOfMoney=" + amountOfMoney + ", accountStatus="
				+ accountStatus + "]";
	}
}
