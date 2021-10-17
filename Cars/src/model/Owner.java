/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Oct 15, 2021 (finished by Jacob Krebs 10/17/21)
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author delan
 *
 */
@Entity
public class Owner {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;

	//no-arg constructor
	public Owner() {
		super();
	}
	
	public Owner(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Owner(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	
	//Note: removed phone number variable
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
