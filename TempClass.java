package com.mrd.vicky;

public class TempClass {

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    v1.setColor("Black");
    v1.setCompanyName("Apache");
    v1.setPrice(147500);
    v1.setNumberOfWheels(2);

    //String s1 = ;
    System.out.println("Company Name: " + v1.getCompanyName());
    System.out.println("Color: " + v1.getColor());
    System.out.println("Number of wheels: "+ v1.getNumberOfWheels());
    System.out.println("           " + v1.getPrice());

    v1.run();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    Vehicle v2 = new Vehicle();
    v2.setColor("White");
    v2.setCompanyName("Tesla");
    v2.setPrice(90000000);
    v2.setNumberOfWheels(4);

    //String s1 = ;
    System.out.println("Company Name: " + v2.getCompanyName());
    System.out.println("Color: " + v2.getColor());
    System.out.println("Number of wheels: "+ v2.getNumberOfWheels());
    System.out.println("           " + v2.getPrice());

    v2.run();
  }
}
