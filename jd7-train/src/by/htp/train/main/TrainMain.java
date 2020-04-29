package by.htp.train.main;

import by.htp.train.bean.Train;
import by.htp.train.view.TrainPrint;
import by.htp.train.logic.TrainLogic;

public class TrainMain {

public static void main(String[] args) {
	
	TrainLogic logic = new TrainLogic();
	TrainPrint view = new TrainPrint();
		
		int size = 2;
		
		Train[] trains;
		
		trains = logic.initTrain(size);
		logic.sortingTrain(trains);
		
		view.printTrain(trains);
	}
	
}
