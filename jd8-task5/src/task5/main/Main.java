package task5.main;

import task5.bean.Voucher.Cruise;
import task5.bean.Voucher.Excursion;
import task5.bean.Voucher.Shopping;
import task5.logic.VoucherLogic;

public class Main {
public static void main(String[] args) {
		
		
		VoucherLogic logic = new VoucherLogic();
		
		
		System.out.println();
		
		logic.findByTransport("Ïîåçä");
		
		System.out.println();
		
		logic.findByFood("Âñå âêëþ÷åíî");
		
		System.out.println();
		
		logic.findByDays(14);
		
		System.out.println();
		
		logic.sortVoucher(Shopping.values());
		
		System.out.println();
		
		logic.sortVoucher(Cruise.values());
		
		System.out.println();
		
		logic.choiñeTypeOfVaucher(Excursion.values());
		
	

	}
}
