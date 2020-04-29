package numer02.logic;

import numer02.bean.Fraction;

public class FractionLogic {

	private int findNod(int numerator, int denominator) {

		int nod;
		
		nod = Math.min(numerator, denominator);
		while(!(numerator % nod == 0 && denominator % nod == 0)) {
			nod--;
		}
		
		return nod;
	}

	public void sokr(Fraction fr) {
		int nod;
		
		nod = findNod(fr.getNumerator(), fr.getDenominator());
		
		fr.setNumerator(fr.getNumerator() / nod);
		fr.setDenominator(fr.getDenominator() / nod);

	}
	
	public Fraction add(Fraction fr1, Fraction fr2) {
		
		int newNum;
		int newDen;
		
		newDen = fr1.getDenominator() * fr2.getDenominator();
		newNum = fr1.getNumerator() * fr2.getDenominator() + fr2.getNumerator() * fr1.getDenominator();
		
		Fraction newFr = new Fraction(newNum, newDen);
		
		return newFr;
		
	}
	
}
