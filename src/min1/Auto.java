package min1;

public class Auto {

	private int horsepower;
	private int year;
	private SteeringWheel steeringWheel;
	private Engine engine;

	public Auto(int horsepower, int year, SteeringWheel steeringWheel, Engine engine) {
		super();
		this.horsepower = horsepower;
		this.year = year;
		this.steeringWheel = steeringWheel;
		this.engine = engine;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public int getYear() {
		return year;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Auto [horsepower=" + horsepower + ", year=" + year + ", steeringWheel=" + steeringWheel + ", engine=" + engine + "]";
	}

}


