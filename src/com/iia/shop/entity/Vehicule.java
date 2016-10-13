package com.iia.shop.entity;

import java.io.Serializable;

public class Vehicule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7688737801354365871L;
	private int Id;
	private String Brand;
	private int Year;
	private int Speed;
	private String Model;
	private String Color;
	private double Price;

	public Vehicule() {
		super();
	}

	public Vehicule(int id, String marque, int year, int speed, String model, String color, double price) {
		super();
		this.Id = id;
		this.Brand = marque;
		this.Year = year;
		this.Speed = speed;
		this.Model = model;
		this.Color = color;
		this.Price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	
	public String getMarque() {
		return Brand;
	}

	public void setMarque(String marque) {
		this.Brand = marque;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		this.Year = year;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		this.Speed = speed;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		this.Model = model;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public void start() {
	}

	public void stop() {
	}

	public void speedUp(int speed) {
		this.Speed = this.Speed + speed;
	}

	public void speedDown(int speed) {
		this.Speed = this.Speed - speed;
	}
}
