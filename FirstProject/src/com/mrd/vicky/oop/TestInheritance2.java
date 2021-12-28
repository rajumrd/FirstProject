package com.mrd.vicky.oop;

interface Animal {
	
	public final String name = "name"; // by default all fields in interface are final, and hence they should in initialized with some value
	abstract void bark(); //by default methods are abstract and public

	
	default public void eat() { //in an interface only default methods can have body //by default methods are public
		System.out.println("eating...");
	}
}

interface BloodType {
	abstract String bloodType();
}

class Dog implements Animal, BloodType { //in java one class can implement multiple interfaces. Instead of extends we use implements to implement an interface
	
	public void eat() { //This is overriding parent class's eat method
		System.out.println("eating bones...");
	}

	public void bark() {
		System.out.println("bow wow....");
	}
	
	public void run() {
		System.out.println("Running.....");
	}

	@Override
	public String bloodType() {
		return OurConstants.WORM_BLOODED;
	}
}

class Cat implements Animal, BloodType {
	
	public void bark() {
		System.out.println("meauo...");
	}
	
	public void eat() {
		System.out.println("eating fish...");
	}

	@Override
	public String bloodType() {
		return OurConstants.WORM_BLOODED;
	}
}

class Fish implements Animal, BloodType {

	@Override
	public String bloodType() {
		return OurConstants.COLD_BLOODED;
	}

	@Override
	public void bark() {
		System.out.println("Can't bark :(");
	}
	
}

class Doberman extends Dog {
	
	public void eat() {
		System.out.println("eating pedigree...");
	}
	
	void sprint() {
		System.out.println("jump jump jump...");
	}
}

class OurConstants {
	public static final String WORM_BLOODED = "Warm Blooded"; //In java constants are defined using public static final
	public static final String COLD_BLOODED = "Cold Blooded";
}

class TestInheritance2 {
	
	public static void main(String args[]) {
		
		//Animal a = new Animal();  //You can't instantitate Abstract class
		//a.eat();
		
		/*Dog d = new Dog();
		d.bark();
		d.eat();
		
		Cat c = new Cat();
		c.bark();
		c.eat();*/
		
		Animal a; //Superclass object reference can hold objects of subclasses as well, 
		//Using superclass reference you can only access methods mentioned in superclass
		//But if subclass has those method overriden then those methods are invoked
		
		a = new Dog(); 
		a.bark();
		a.eat(); //Runtime Polymorphism
		//a.run(); Using superclass reference you can only access methods defined in superclass
		
		a = new Cat(); 
		a.bark();
		a.eat();
		
		a = new Doberman(); 
		a.bark();
		a.eat();
		
		/*Polymorphism : a single entity having different behavior in different situations
		polymorphism allows you to define one interface and have multiple implementations.
		
		Compile-time/static polymorphism: function overloading
		runtime/dynamic polymorphism: function overriding
		
		*/
	}
}