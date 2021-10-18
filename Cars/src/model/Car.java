/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Oct 15, 2021
 */
package model;

/**
 * @author delan
 *
 */
public class Car {

	private int year;
	private String make;
	private String model;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + "]";
	}
	
	public Car (int year, String make, String model) {
		this.year = year;
		this.make = make;
		this.model = model;
	}
	
	public Car (String make, String model) {
		this.make = make;
		this.model = model;
	}
}
