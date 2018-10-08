//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {	
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		//ksdfjl;ajflkjsklndckdsf;dsfjlkafkflasjfdjfajkdnvjdvjdfjjfjs+=-0987654321
		System.out.println(randomNumber);
String f="You're cool!";
		// 1. Use each value of randomNumber to give the user a random compliment.

	

if(randomNumber==0){
	System.out.println(f);
	
}
if(randomNumber==1) {
	System.out.println("you're cool.");
}
if(randomNumber==2) {
	System.out.println("You're cool-ish!");
}

	if(randomNumber==3) {
		System.out.println("you cool");
	}
	
	if(randomNumber==4) {
		System.out.println("You're too cool to read this!");
	
		
	
}	// 2. Repeat all the code above 10 times
		}
	}
}	// 3. Find someone to test out your program. They will like it :)
	


