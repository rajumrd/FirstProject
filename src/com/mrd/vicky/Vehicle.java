package com.mrd.vicky;

public class Vehicle {

  private String companyName;
  private int numberOfWheels;
  private String color;
  private double price;
  private double currentSpeed;
  private int speedInOneGear;

  Vehicle(){ //default no argument constructor

  }

  Vehicle(String companyName, int numberOfWheels, String color, double price){
	  this.companyName = companyName;
	  this.numberOfWheels = numberOfWheels;
	  this.color = color;
	  this.price = price;
	  this.speedInOneGear = 15;
  }
  
  Vehicle(String companyName, int numberOfWheels, String color, double price, double currentSpeed){
	  this.companyName = companyName;
	  this.numberOfWheels = numberOfWheels;
	  this.color = color;
	  this.price = price;
	  this.currentSpeed = currentSpeed;
	  this.speedInOneGear = 20;
  }

  public void go() {
    System.out.println(companyName + " has " + numberOfWheels + " wheels. And it goes broom vroom at speed: "+ currentSpeed);
  }
  
  public void go(int gear) {
	currentSpeed = speedInOneGear * gear;
    System.out.println(companyName + " has " + numberOfWheels + " wheels. And it goes broom vroom at speed: "+ currentSpeed);
  }


  public void printValue(){
	System.out.println("Company Name: " + getCompanyName());
    System.out.println("Color: " + getColor());
    System.out.println("Number of wheels: "+ getNumberOfWheels());
    System.out.println("Price: " + getPrice());
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


}
