package com.mrd.vicky;

public class PrintingPatterns {
	
	public void printOneRowWithStars(int numberOfColumns){
		
		for(int i = 1; i <= numberOfColumns; i++) { //1st intialization of loop variable; 2nd loop continuation condition/expression; 3rd loop variable value changer
			System.out.print("*");
		}
		
		System.out.println("\n"); //newline escape character
	}
	
	public void printStars(int numberOfRows, int numberOfColumns){
		
		for(int i = 1; i <= numberOfRows; i++){
			
			for(int j = 1; j <= numberOfColumns; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("\n");
	}
	
   public void printTriangle(int numberOfRows){
		
		for(int i = 1; i <= numberOfRows; i++){
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		PrintingPatterns p = new PrintingPatterns();
		p.printOneRowWithStars(4);
		
		p.printStars(10, 10);
		
		p.printTriangle(5);
	}

}
