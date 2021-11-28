package com.mrd.vicky;

public class TempClass {

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle("Apache", 2, "Black", 147500);
    v1.setColor("Matte Black");
    
    v1.printValue();
    v1.go(3);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    Vehicle v2 = new Vehicle("Tesla", 4, "White", 90000000, 5);
    v2.printValue();
    v2.go(4);
  }
}
