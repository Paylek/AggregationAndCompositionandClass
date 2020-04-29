package airlane.view;

import java.util.List;

import airlane.bean.Airline;

public class ViewAirport {
	public void showList(List<Airline> airlineList) {
		for (Airline c : airlineList) {
			System.out.println(c);
		}
	}
}
