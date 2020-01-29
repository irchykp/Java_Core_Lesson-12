package min1;

public class SteeringWheel {
	private int diameter;
	private String material;

	public SteeringWheel(int diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}

	public int getDiameter() {
		return diameter;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diameter=" + diameter + ", material=" + material + "]";
	}

}
