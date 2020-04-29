package time.bean;

public class Time {
	private int hours;
	private int min;
	private int sec;

	public Time() {

	}

	public Time(int hours, int min, int sec) {
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours > 23) {
			this.hours = 0;
		}
		this.hours = hours;

	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min > 59) {
			this.min = 0;
		}
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec > 59) {
			this.sec = 0;
		}
		this.sec = sec;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + min;
		result = prime * result + sec;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (min != other.min)
			return false;
		if (sec != other.sec)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clock [hours=" + hours + ", min=" + min + ", sec=" + sec + "]";
	}
}
