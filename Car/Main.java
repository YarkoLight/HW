package Car;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		Car car1 = new Car("Bmw", 2018, 600);
		Car car2 = new Car("Mersedes", 2015, 500);
		Car car3 = new Car("Lamborghini", 2017, 700);
		Car car5 = new Car("Bmw", 2017, 650);
		Car car4 = new Car("Audi", 2010, 550);

		Car[] cars = { car1, car2, car3, car4, car5 };

		CarManage carManage = new CarManage();

		while (true) {
			System.out.println();
			System.out.println("enter 1 to see car with input year");
			System.out.println("enter 2 to see cars which ordering by year");

			int choise = scanner.nextInt();
			switch (choise) {

			case 1: {
				carManage.enterYearToSeeCar(cars);
				break;
			}

			case 2: {
				carManage.carOrder(cars);
				break;
			}

			default: {
				System.out.println("PLEASE ENTER 1 OR 2");
				break;
			}
			}

		}
}
	
	

}
