package time.main;

import time.bean.Time;
import time.logic.TimeLogic;
import time.view.TimePrint;

public class TimeMain {
public static void main(String[] args) {
		
		Time clock1 = new Time(10, 12, 53);
		TimeLogic logic = new TimeLogic();
		TimePrint view = new TimePrint();
		
		view.printTime(clock1);
		
		logic.changeHours(clock1, 25);
		logic.changeMin(clock1, 50);
		logic.changeSec(clock1, 50);
		
		view.printTime(clock1);
}
}
