package time.view;

import time.bean.Time;

public class TimePrint {
public void printTime(Time clock) {
		
		System.out.println(clock.getHours() + " ����� " + clock.getMin() + " ����� " + clock.getSec() + " ������");
		
	}
}
