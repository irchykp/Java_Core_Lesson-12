package max;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();

		myList.add("Chicago");
		myList.add("New York");
		myList.add("Toronto");
		myList.add("Paris");
		myList.add("Kyiv");
		myList.add("London");
		myList.add("Rome");
		myList.add("Madrid");
		myList.add("Athens");

		System.out.println(myList);
		System.out.println();

		myList.remove(3);
		myList.remove(7);
		if (myList.size() > 8)
			myList.remove(8);
		
		for (Object object : myList) {
			System.out.println(object + "_");
		}
	}
}
