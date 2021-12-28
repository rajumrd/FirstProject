package com.mrd.vicky;

public class TempClass extends Object { //by default all classes in java extend Object class

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle("Apache", 2, "Black", 147500);
    v1.setColor("Matte Black");
    v1.nickName = "Batmobile";
    v1.printValue();
    v1.go(3);
    System.out.println("My nickname: "+ v1.nickName);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    Vehicle v2 = new Vehicle("Tesla", 4, "White", 90000000, 5);
    v2.nickName = "Optimus Prime";
    v2.printValue();
    v2.go(4);
    System.out.println("My nickname: "+ v2.nickName);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    Vehicle v3 = new Vehicle();
    v3.setCompanyName("Mahindra");
    v3.printValue();
    v3.go(4);
    System.out.println("My nickname: "+ v3.nickName);
    
    
    System.out.println("Vehicle class version: "+ Vehicle.version);
    System.out.println("Vehicle class version: "+ v1.version);
    System.out.println("Vehicle class version: "+ v2.version);
    System.out.println("Vehicle class version: "+ v3.version);
    
    /* Fields and Method can be on both class level or instance level
     * Class Level : static : only once field exists for all objects of that class. 
     * Instance level: non static : value can be different for different objects
     * 
     */
  }
}
