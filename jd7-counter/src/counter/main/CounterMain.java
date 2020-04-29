package counter.main;

import counter.bean.Counter;
import counter.logic.CounterLogic;
import counter.view.CounterPrint;

public class CounterMain {
	public static void main(String[] args) {
		Counter count1  = new Counter(12, 8, 25);
		
		CounterLogic logic = new CounterLogic();
		CounterPrint view = new CounterPrint();
		
		
		view.printValue(count1.getValue());
		
		count1.setValue(logic.increaseValue(count1.getValue(), count1.getMin(), count1.getMax()));
		
		view.printValue(count1.getValue());
		
		count1.setValue(logic.decreaseValue(count1.getValue(), count1.getMin(), count1.getMax()));
		
		view.printValue(count1.getValue());

	}
}
