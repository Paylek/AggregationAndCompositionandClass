package task5.bean;

public class Voucher {
public enum Recreation{
		
		EGYPT("Автобус", "Все включено", 14),
		TURKEY("Самолет", "Все включено", 9),
		CYPRUS("Самолет", "Завтрак", 12),
		GOA("Корабль", "Без питания", 10);
		
		String typeOfTransport;
		String food;
		int numberOfDays;

		Recreation(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
		
			

	}

	public enum Treatment{
		
		MONTENEGRO("Самолет", " Завтрак,Обед", 20),
		KISLOVODSK("Автобус", "Все включено", 25),
		SOCHI("Поезд", " Завтрак,Обед", 14),
		BELARUS("Автобус", "Все включено", 23);
	
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Treatment(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Excursion{
		
		PARIS("Самолет", "Завтрак", 5),
		LONDON("Самолет", "Завтрак", 7),
		AMSTERDAM("Автобус", "Все включено", 5),
		PRAHA("Поезд", "Все включено", 8);

		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Excursion(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Shopping{
		
		PARIS("Самолет", "Без питания", 4),
		ROME("Поезд", "Завтрак", 5),
		MONTECARLO("Автобус", "Все включено", 2),
		LONDON("Самолет", "Завтрак", 6);
	
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Shopping(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}
		
		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Cruise{
		
		KINGOFSEA("Лайнер", "Все включено", 5),
		BLUEOCEAN("Лайнер", "Завтрак", 4),
		PIRATESOFTHECARIBIAN("Лайнер", "Завтрак,Обед", 10);

		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Cruise(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		
		@Override
		public String toString() {
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
}
