package domain;

public class CarBean {

	//private Engine engine;
	
	private String model;
	private Integer power;
	private String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public CarBean(String model, Integer power, String color) {
		super();
		this.model = model;
		this.power = power;
		this.color = color;
	}
	public CarBean() {
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", power=" + power + ", color=" + color + "]";
	}

}
