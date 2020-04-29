package airlane.main;

import java.util.List;

import airlane.bean.Airline;
import airlane.bean.Airport;
import airlane.logic.AirportLogic;
import airlane.view.ViewAirport;

public class DemoAirport {
	public static void main(String[] args) {
		Airport domodedovo = new Airport("�������");
		AirportLogic logic = new AirportLogic();
		ViewAirport view = new ViewAirport();

		domodedovo.addAirlineToAirportList(new Airline("�����", 777, "��-167", "10:30", "�����������,�����,�������"));
		domodedovo.addAirlineToAirportList(new Airline("������", 161, "�����-747", "22:33", "�����,�������"));
		domodedovo.addAirlineToAirportList(new Airline("���-����", 100, "��-134", "15:37", "�����������,�����,�������"));
		domodedovo.addAirlineToAirportList(new Airline("�����", 756, "��-154", "18:30", "�����������,�������,�����������"));
		domodedovo.addAirlineToAirportList(new Airline("������", 457, "��-167", "14:25", "�����������,�����,�������"));
		domodedovo.addAirlineToAirportList(new Airline("�����", 777, "��-167", "10:10", "�������,�����������"));

		view.showList(domodedovo.airlineList);

		System.out.println("������ ������ ��� ��������� ������ ����������:");

		List<Airline> listSortByDestination = logic.getListByDestination(domodedovo.airlineList, "�����");
		
		view.showList(listSortByDestination);

		System.out.println("������ ������ ��� ��������� ��� ������:");

		List<Airline> listSortByDayOfTheWeek = logic.getListByDayOfTheWeek(domodedovo.airlineList, "�����");
		
		view.showList(listSortByDayOfTheWeek);

		System.out.println("������ ������ ��� ��������� ��� ������, ������� �������� ����� ��������� �������:");

		List<Airline> listSortByDayOfTheWeekAndTimeAway = logic.getListByDayOfTheWeekAndTime(domodedovo.airlineList, "�������", "10:00");
		
		view.showList(listSortByDayOfTheWeekAndTimeAway);

	}
}
