package question4;

import java.util.Comparator;

public class CompareCar implements Comparator<Car> {

	@Override
	public int compare(Car a, Car b) {
		int compare = a.getManufacturer().compareTo(b.getManufacturer());
		if(compare == 0)
			compare = a.getAge()-b.getAge();
		
		return compare;
	}
}
