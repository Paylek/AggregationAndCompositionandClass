package task2.bean;

import java.util.List;

public class Car {
private String carMake;
	
	private int fueltank;
	
	private List<Wheel> wheels;
	
	private Engine engine;
	
	public Car() {
		
	}
	
	public Car(String carMake, int fueltank, List<Wheel> wheels, Engine engine) {
		this.carMake = carMake;
		this.fueltank = fueltank;
		this.wheels = wheels;
		this.engine = engine;
	}

	public int getFueltank() {
		return fueltank;
	}

	public void setFueltank(int fueltank) {
		this.fueltank = fueltank;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carMake == null) ? 0 : carMake.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carMake == null) {
			if (other.carMake != null)
				return false;
		} else if (!carMake.equals(other.carMake))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [carMake=" + carMake + ", fueltank=" + fueltank + ", wheels=" + wheels + ", engine=" + engine + "]";
	}
}
