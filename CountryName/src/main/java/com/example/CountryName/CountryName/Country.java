package com.example.CountryName.CountryName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Country234")
public class Country {
	@Id
	long id;
public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
String name;
String capital;
String population;
public Country() {
	// TODO Auto-generated constructor stub
}
public Country(long o,String string, String string2, String string3) {
	// TODO Auto-generated constructor stub
	this.id=o;
	this.name= string;
	this.capital=string2;
	this.population=string3;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
public String getPopulation() {
	return population;
}
public void setPopulation(String population) {
	this.population = population;
}

}
