package task4.bean;

import java.util.List;

public class Customer {
	private String name;
	private String surname;
	private List<BankAccount> listAccount;
	
	public Customer() {
		
	}
	
	public Customer(String name, String surname, List<BankAccount> listAccount) {
		this.name = name;
		this.surname = surname;
		this.listAccount = listAccount;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<BankAccount> getListAccount() {
		return listAccount;
	}
	public void setListAccount(List<BankAccount> listAccount) {
		this.listAccount = listAccount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listAccount == null) ? 0 : listAccount.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (listAccount == null) {
			if (other.listAccount != null)
				return false;
		} else if (!listAccount.equals(other.listAccount))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", listAccount=" + listAccount + "]";
	}
}
