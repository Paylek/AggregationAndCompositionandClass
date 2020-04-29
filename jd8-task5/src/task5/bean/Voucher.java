package task5.bean;

public class Voucher {
public enum Recreation{
		
		EGYPT("�������", "��� ��������", 14),
		TURKEY("�������", "��� ��������", 9),
		CYPRUS("�������", "�������", 12),
		GOA("�������", "��� �������", 10);
		
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
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
		
			

	}

	public enum Treatment{
		
		MONTENEGRO("�������", " �������,����", 20),
		KISLOVODSK("�������", "��� ��������", 25),
		SOCHI("�����", " �������,����", 14),
		BELARUS("�������", "��� ��������", 23);
	
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
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Excursion{
		
		PARIS("�������", "�������", 5),
		LONDON("�������", "�������", 7),
		AMSTERDAM("�������", "��� ��������", 5),
		PRAHA("�����", "��� ��������", 8);

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
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Shopping{
		
		PARIS("�������", "��� �������", 4),
		ROME("�����", "�������", 5),
		MONTECARLO("�������", "��� ��������", 2),
		LONDON("�������", "�������", 6);
	
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
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Cruise{
		
		KINGOFSEA("������", "��� ��������", 5),
		BLUEOCEAN("������", "�������", 4),
		PIRATESOFTHECARIBIAN("������", "�������,����", 10);

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
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}
}
