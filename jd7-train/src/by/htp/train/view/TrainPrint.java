package by.htp.train.view;

import by.htp.train.bean.Train;

public class TrainPrint {

public void printTrain(Train[] sts) {
		
		for (Train train : sts) {
			System.out.println(train.getNamePoint() + " " + train.getTrainNumber() + " " + train.getTrainTime());
		}
		
	}
	
}
