package task3.bean;

import java.util.ArrayList;
import java.util.List;

public class State {
private String nameOfState;
	
	private int area;
	
	private List<Region> listRegion = new ArrayList<Region>();
	
	public State() {
		
	}
	
	public State(String nameOfState, int area, List<Region> region) {
		
		this.nameOfState = nameOfState;
		this.area = area;
		this.listRegion = region;
		
	}

	public String getNameOfState() {
		return nameOfState;
	}

	public void setNameOfState(String nameOfState) {
		this.nameOfState = nameOfState;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public List<Region> getListRegion() {
		return listRegion;
	}

	public void setListRegion(List<Region> listRegion) {
		this.listRegion = listRegion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
		result = prime * result + ((listRegion == null) ? 0 : listRegion.hashCode());
		result = prime * result + ((nameOfState == null) ? 0 : nameOfState.hashCode());
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
		State other = (State) obj;
		if (area != other.area)
			return false;
		if (listRegion == null) {
			if (other.listRegion != null)
				return false;
		} else if (!listRegion.equals(other.listRegion))
			return false;
		if (nameOfState == null) {
			if (other.nameOfState != null)
				return false;
		} else if (!nameOfState.equals(other.nameOfState))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [nameOfState=" + nameOfState + ", area=" + area + ", listRegion=" + listRegion + "]";
	}

}
