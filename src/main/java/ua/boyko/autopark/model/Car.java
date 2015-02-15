package ua.boyko.autopark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car {
	

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;

	@Column(name = "Brand")
	private String brand;

	@Column(name = "Modelcar")
	private String modelcar;

	@Column(name = "Age")
	private Integer age;

	@Column(name = "Number")
	private String number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelcar() {
		return modelcar;
	}

	public void setModelcar(String modelcar) {
		this.modelcar = modelcar;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
}