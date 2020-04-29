package task3.bean;

import java.util.ArrayList;
import java.util.List;

public class District {
private String nameOfDistrict;
	
	private List<City> listCity = new ArrayList<City>();
	
	public District() {
		
	}
	
	public District(String name, List<City> listCity) {
		
		this.nameOfDistrict = name;
		this.listCity = listCity;
		
	}

	public String getNameOfDistrict() {
		return nameOfDistrict;
	}

	public void setNameOfDistrict(String nameOfDistrict) {
		this.nameOfDistrict = nameOfDistrict;
	}

	public List<City> getListCity() {
		return listCity;
	}

	public void setListCity(List<City> listCity) {
		this.listCity = listCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listCity == null) ? 0 : listCity.hashCode());
		result = prime * result + ((nameOfDistrict == null) ? 0 : nameOfDistrict.hashCode());
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
		District other = (District) obj;
		if (listCity == null) {
			if (other.listCity != null)
				return false;
		} else if (!listCity.equals(other.listCity))
			return false;
		if (nameOfDistrict == null) {
			if (other.nameOfDistrict != null)
				return false;
		} else if (!nameOfDistrict.equals(other.nameOfDistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [nameOfDistrict=" + nameOfDistrict + ", listCity=" + listCity + "]";
	}
	
}
