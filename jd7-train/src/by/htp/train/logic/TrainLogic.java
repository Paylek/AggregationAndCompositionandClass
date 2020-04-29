package by.htp.train.logic;

import java.util.Scanner;

import by.htp.train.bean.Train;

public class TrainLogic {

	public Train[] initTrain(int size) {

		Train[] trains = new Train[size];
			
			for (int i = 0; i < size; i++) {
				trains[i] = new Train();
				System.out.println("Введите пункт назначения " + (i + 1) + " поезда: \r");
				trains[i].setNamePoint(scannerString());
				System.out.println("Введите номер " + (i + 1) + " поезда: \r");
				trains[i].setTrainNumber(scannerInt());
				System.out.println("Введите время отправления " + (i + 1) + " поезда: \r");
				trains[i].setTrainTime(scannerInt());

			}
			return trains;
		}
	
	public void sortingTrain(Train[] trainNumber) {
		
		    
		    int previous, current;
		    
		    for(int i = 1; i < trainNumber.length; i++) {
		      
		      current = trainNumber[i].getTrainNumber();
		      previous = trainNumber[i-1].getTrainNumber();
		      
		      if (current < previous) {
		        for (int j = i; j > 0; j--) {
		          if (trainNumber[j].getTrainNumber() < trainNumber[j-1].getTrainNumber()) {
		            
		            Train temp;
		            temp = trainNumber[j];
		            trainNumber[j] = trainNumber[j-1];
		            trainNumber[j-1] = temp;  
		          }
		        }
		      }  
		    }
	}
	
	public void specificNumber(Train[] train) {
		
		System.out.println("Введите номер поезда \r");
		int k = scannerInt();
		System.out.println(train[k].getNamePoint() + " " + train[k].getTrainNumber() + " " + train[k].getTrainTime());
		
	}
	
	
	public static String scannerString() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		String symbol;
	
		while(!in.hasNextLine()) {
		
			in.next();
		
			System.out.println("Некорректный ввод! \r");
		}
		symbol = in.nextLine();
	
		return symbol;
	}
	
public static int scannerInt() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int number;
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("Некорректный ввод!\r ");
		}
		number = in.nextInt();
	
		return number;
		
	}
	
}
