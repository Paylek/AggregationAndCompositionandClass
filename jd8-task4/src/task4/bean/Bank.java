package task4.bean;

import java.util.List;

public class Bank {
	private String nameOfBank;
	private List<Customer> listCustomer;
	
	public Bank() {
		
	}
	
	public Bank(String nameOfBank, List<Customer> listCustomer) {
		this.nameOfBank = nameOfBank;
		this.listCustomer = listCustomer;
	}
	
	public String getNameOfBank() {
		return nameOfBank;
	}
	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}
	public List<Customer> getListCustomer() {
		return listCustomer;
	}
	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listCustomer == null) ? 0 : listCustomer.hashCode());
		result = prime * result + ((nameOfBank == null) ? 0 : nameOfBank.hashCode());
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
		Bank other = (Bank) obj;
		if (listCustomer == null) {
			if (other.listCustomer != null)
				return false;
		} else if (!listCustomer.equals(other.listCustomer))
			return false;
		if (nameOfBank == null) {
			if (other.nameOfBank != null)
				return false;
		} else if (!nameOfBank.equals(other.nameOfBank))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [nameOfBank=" + nameOfBank + ", listCustomer=" + listCustomer + "]";
	}
	
	
}
