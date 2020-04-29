package task3.view;

import java.util.List;

import task3.bean.City;
import task3.bean.State;

public class PrintInfo {
	public void printInformation(City city) {

		System.out.println(city);

	}

	public void printInformation(int i) {

		System.out.println(i);
	}

	public void printArea(State state) {

		System.out.println(state.getArea());
	}

	public void printInformation(List<City> centers) {
		for (City c : centers) {
			System.out.println(c);
		}

	}
}
