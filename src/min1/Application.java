package min1;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Random r = new Random();
		List<String> materials = new ArrayList<>();
		materials.add("Leather");
		materials.add("Alcantara");
		ArrayList<ArrayList<Auto>> myAuto = new ArrayList<ArrayList<Auto>>();

		int xSize = r.nextInt(10);
		int ySize = r.nextInt(10);

		for (int i = 0; i < xSize; i++) {
			myAuto.add(new ArrayList<Auto>());
			for (int j = 0; j < ySize; j++) {
				int horsepower = 50 + r.nextInt(250);
				int year = 1950 + r.nextInt(70);
				SteeringWheel steeringWheel = new SteeringWheel(10 + r.nextInt(5), materials.get(r.nextInt(1)));
				Engine engine = new Engine(1 + r.nextInt(11));
				myAuto.get(i).add(new Auto(horsepower, year, steeringWheel, engine));
			}
		}
		System.out.println(Arrays.toString(myAuto.toArray()));
		int horsepower = 50 + r.nextInt(250);
		int year = 1950 + r.nextInt(70);
		SteeringWheel steeringWheel = new SteeringWheel(10 + r.nextInt(5), materials.get(r.nextInt(1)));
		Engine engine = new Engine(1 + r.nextInt(11));
		Auto defaultAuto = new Auto(horsepower, year, steeringWheel, engine);

		for (ArrayList<Auto> row : myAuto) {
			for (int j = 0; j < row.size(); j++) {
				row.set(j, defaultAuto);
			}
		}
		System.out.println(Arrays.toString(myAuto.toArray()));
	}


}
