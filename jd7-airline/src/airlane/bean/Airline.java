package airlane.bean;

public class Airline {
	private String destination;
	private int flightNumber;
	private String typeOfAircraft;
	private String timeAway;
	private String dayOfTheWeek;

	public Airline() {

	}

	public Airline(String destination, int flightNumber, String typeOfAircraft, String timeAway, String daysOfTheWeek) {

		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeOfAircraft = typeOfAircraft;
		this.timeAway = timeAway;
		this.dayOfTheWeek = daysOfTheWeek;

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeOfAircraft() {
		return typeOfAircraft;
	}

	public void setTypeOfAircraft(String typeOfAircraft) {
		this.typeOfAircraft = typeOfAircraft;
	}

	public String getTimeAway() {
		return timeAway;
	}

	public void setTimeAway(String timeAway) {
		this.timeAway = timeAway;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(String daysOfTheWeek) {
		this.dayOfTheWeek = daysOfTheWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfTheWeek == null) ? 0 : dayOfTheWeek.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((timeAway == null) ? 0 : timeAway.hashCode());
		result = prime * result + ((typeOfAircraft == null) ? 0 : typeOfAircraft.hashCode());
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
		Airline other = (Airline) obj;
		if (dayOfTheWeek == null) {
			if (other.dayOfTheWeek != null)
				return false;
		} else if (!dayOfTheWeek.equals(other.dayOfTheWeek))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (timeAway == null) {
			if (other.timeAway != null)
				return false;
		} else if (!timeAway.equals(other.timeAway))
			return false;
		if (typeOfAircraft == null) {
			if (other.typeOfAircraft != null)
				return false;
		} else if (!typeOfAircraft.equals(other.typeOfAircraft))
			return false;
		return true;
	}

	public String toString() {
		return String.format(
				"����� ����������: %8s\t ����� �����:  %d\t ��� ��������: %9s\t ����� ������: %s\t ��� ������: %s",
				destination, flightNumber, typeOfAircraft, timeAway, dayOfTheWeek);
	}
}
