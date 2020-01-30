package max;

public class Application {

	public static void main(String[] args) {
		MyList myList = new MyList();
		myList.add("Chicago");
		myList.add("New York");
		myList.add("Toronto");
		myList.add("Paris");
		myList.add("Kyiv");
		myList.add("London");
		myList.add("Rome");
		myList.add("Madrid");
		myList.add("Athens");

		myList.print();

		myList.remove(3);
		myList.remove(7);

		myList.print();
	}
}
