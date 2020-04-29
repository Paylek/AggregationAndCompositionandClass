package task3.bean;

public class City {
	private String nameOfCity;

	private int areaCity;

	public City() {

	}

	public City(String name, int areaCity) {
		this.nameOfCity = name;
		this.areaCity = areaCity;
	}

	public int getAreaCity() {
		return areaCity;
	}

	public void setAreaCity(int areaCity) {
		this.areaCity = areaCity;
	}

	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfCity == null) ? 0 : nameOfCity.hashCode());
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
		City other = (City) obj;
		if (nameOfCity == null) {
			if (other.nameOfCity != null)
				return false;
		} else if (!nameOfCity.equals(other.nameOfCity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "" + nameOfCity + ", areaCity = " + areaCity + "";
	}
}
