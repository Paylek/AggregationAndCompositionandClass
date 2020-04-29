package task2.logic;

import java.util.ArrayList;
import java.util.List;

import task2.bean.Car;
import task2.bean.Wheel;

public class CarLogic {
	public void drive(Car car) {

		if (car.getEngine() != null) {
			if (car.getFueltank() == 0) {
				System.out.println("Заправьте автомобиль");

			} else {
				System.out.println("Машина поехала");
			}
		} else {
			System.out.println("У вас нет двигателя");
		}

	}

	public Car refuel(Car car, int fuel) {

		car.setFueltank(fuel);
		
		System.out.println("Машина заправлена");

		return car;
	}

	public Car changeWheels(Car car, int numberOfWheel, Wheel newWheel) {

		List<Wheel> listWheels = new ArrayList<Wheel>(car.getWheels());

		listWheels.set(numberOfWheel, newWheel);

		car.setWheels(listWheels);

		return car;
	}

}
