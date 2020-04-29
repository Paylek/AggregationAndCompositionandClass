package task5.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import task5.bean.Voucher.Cruise;
import task5.bean.Voucher.Excursion;
import task5.bean.Voucher.Recreation;
import task5.bean.Voucher.Shopping;
import task5.bean.Voucher.Treatment;

public class VoucherLogic {
public void findByTransport(String transport) {
		
		System.out.println();
		
		for(Shopping c : Shopping.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Recreation c : Recreation.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Treatment c : Treatment.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Cruise c : Cruise.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
		
		for(Excursion c : Excursion.values()) {
			if(c.getTypeOfTransport() == transport) {
				System.out.println(c);
			}
		}
	}
	
	public void findByFood(String food) {
		
		System.out.println();
		
		for(Shopping c : Shopping.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Recreation c : Recreation.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Treatment c : Treatment.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Cruise c : Cruise.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
		
		for(Excursion c : Excursion.values()) {
			if(c.getFood() == food) {
				System.out.println(c);
			}
		}
	}
	
	public void findByDays(int a) {
		
		System.out.println();
		
		for(Shopping c : Shopping.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Recreation c : Recreation.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Treatment c : Treatment.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Cruise c : Cruise.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
		
		for(Excursion c : Excursion.values()) {
			if(c.getNumberOfDays() == a) {
				System.out.println(c);
			}
		}
	}
	
	public <T> void sortVoucher(T[] elem) {
		
		List<T> list = new ArrayList<>();
		
		for(T c : elem) {
			list.add(c);
		}
		
		Collections.sort(list, new Comparator<T>() {
			public int compare(T o1, T o2) {
				return o1.toString().compareTo(o2.toString());}
			});
		
		for(T c : list) {
			System.out.println(c);
		}
		
	}
	
	public <T> void choiñeTypeOfVaucher(T[] elem) {
		
		for(T c : elem) {
			System.out.println(c);
		}
	}	
}
