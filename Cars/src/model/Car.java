/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Oct 15, 2021
 */
package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author delan
 *
 */
@Entity
@Table(name = "cars")
public class Car {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate year;
	private String make;
	private String model;
	
	public Car() {
		super();
	}
	
	public Car(int id, LocalDate year, String make, String model) {
		super();
		this.id = id;
		this.year = year;
		this.make = make;
		this.model = model;
	}
	
	public LocalDate getYear() {
		return year;
	}
	public void setYear(LocalDate year) {
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
	
}
