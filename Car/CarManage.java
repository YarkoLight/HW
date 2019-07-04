package Car;

public class CarManage {
	
	public void enterYearToSeeCar(Car[] cars) {

		System.out.println("Enter year to see the car");
		int iyear = Main.scanner.nextInt();

		boolean exist = false;

		for (int i = 0; i < cars.length; i++) {
			if (iyear == cars[i].getYear()) {
				exist = true;
				System.out.println(cars[i]);
			}
		}

		if (exist == false) {
			System.out.println("Car with this year is not exist");
		}
	}

	public void carOrder(Car[] cars) {

		Car tmp;
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear() > cars[j].getYear()) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}

			}
		}

		System.out.println("Car orber by year:");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

}

}
