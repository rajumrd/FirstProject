package com.mrd.vicky;

public class Vehicle {

  private String companyName;
  private int numberOfWheels;
  private String color;
  private double price;

  Vehicle(){

  }

  Vehicle(String companyName, int numberOfWheels, String ){

  }

  public void run() {
    System.out.println(companyName + " has " + numberOfWheels + " wheels. And it goes broom vroom");
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
