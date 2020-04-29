package task3.bean;

import java.util.ArrayList;
import java.util.List;

public class Region {
private String nameOfRegion;
	
	private List<District> listDistrict = new ArrayList<District>();
	
	public Region() {
		
	}
	
	public Region(String nameOfRegion, List<District> listDistrict) {
		this.nameOfRegion = nameOfRegion;
		this.listDistrict = listDistrict;
	}

	public String getNameOfRegion() {
		return nameOfRegion;
	}

	public void setNameOfRegion(String nameOfRegion) {
		this.nameOfRegion = nameOfRegion;
	}

	public List<District> getListDistrict() {
		return listDistrict;
	}

	public void setListDistrict(List<District> listDistrict) {
		this.listDistrict = listDistrict;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listDistrict == null) ? 0 : listDistrict.hashCode());
		result = prime * result + ((nameOfRegion == null) ? 0 : nameOfRegion.hashCode());
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
		Region other = (Region) obj;
		if (listDistrict == null) {
			if (other.listDistrict != null)
				return false;
		} else if (!listDistrict.equals(other.listDistrict))
			return false;
		if (nameOfRegion == null) {
			if (other.nameOfRegion != null)
				return false;
		} else if (!nameOfRegion.equals(other.nameOfRegion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [nameOfRegion=" + nameOfRegion + ", listDistrict=" + listDistrict + "]";
	}
}
