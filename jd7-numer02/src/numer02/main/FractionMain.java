package numer02.main;

import numer02.bean.Fraction;
import numer02.logic.FractionLogic;
import numer02.view.FractionPrint;

public class FractionMain {

		public static void main(String[] args) {
			FractionLogic logic = new FractionLogic();
			FractionPrint printer = new FractionPrint();
			
			Fraction fr1 = new Fraction(2, 4);
			Fraction fr2 = new Fraction(5, 6);
			
			Fraction fr3;
			
			fr3 = logic.add(fr1, fr2);
			
			logic.sokr(fr3);
			printer.print(fr3);
		}
}
