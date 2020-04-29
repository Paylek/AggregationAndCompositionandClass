package by.htp.student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int size = 2, n = 5;
		
		Student[] students;
		
		students = initStudents(size, n);
		
		students = findAlevelStudents(students);
		printStudents(students);
	}
	
	
	public static Student[] initStudents(int size, int n) {

		Student[] students = new Student[size];
			
			for (int i = 0; i < size; i++) {
				students[i] = new Student();
				System.out.println("Введите имя " + (i + 1) + " студента: \r");
				students[i].setName(scannerString());
				System.out.println("Введите фамилию " + (i + 1) + " студента: \r");
				students[i].setSurname(scannerString());
				System.out.println("Введите группу " + (i + 1) + " студента: \r");
				students[i].setGroupNumber(scannerInt());
				System.out.println("Введите оценки " + (i + 1) + " студента: \r");
				students[i].setMarks(initArray(n));

			}
			return students;
		}
	
	public static void printStudents(Student[] sts) {
		
		for (Student student : sts) {
			System.out.println(student.getName() + " " + student.getSurname() + " " + student.getGroupNumber() + " " + Arrays.toString(student.getMarks()));
		}
		
	}
	public static Student[] findAlevelStudents(Student[] students) {
		Student[] alevelStudents = new Student[students.length];
		int i = 0;
		for (Student student : students) {
			if (isAStudent(student)) {
				alevelStudents[i] = student;
				i++;
			}
		}
		
		if (i == students.length) {
			return alevelStudents;
		}
		
		Student[] result = new Student[i];
		
		for (i = 0; i < result.length; i++) {
			result[i] = alevelStudents[i];
		}
		return result;
		
		
	}
	
	public static boolean isAStudent(Student st) {
		
		int[] marks = st.getMarks();
		for(int mark : marks) {
			if (mark != 5 && mark != 4) {
				return false;
			}
		}
		return true;
		
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
	
public static int[] initArray(int n) {

	  int [] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scannerInt();

		}
		return arr;
	}

}
