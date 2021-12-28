package com.mrd.vicky;

abstract class Animal {
	
	abstract void bark(); //abstract method signature
	/*Note: if you make even a single method abstract, then you have to declare the class as abstract
	Abstract class can't be instantiated/object can't be created.
	
	Abstract method don't have body/definition/implementation, it only has signature
	*/
	
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal { //in java one class can extend only one other class
	
	void eat() { //This is overriding parent class's eat method
		System.out.println("eating bones...");
	}

	void bark() {
		System.out.println("bow wow....");
	}
	
	void run() {
		System.out.println("Running.....");
	}
}

class Cat extends Animal {
	
	void bark() {
		System.out.println("meauo...");
	}
	
	void eat() {
		System.out.println("eating fish...");
	}
}

class Doberman extends Dog {
	
	void eat() {
		System.out.println("eating pedigree...");
	}
	
	void sprint() {
		System.out.println("jump jump jump...");
	}
}

class TestInheritance {
	
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