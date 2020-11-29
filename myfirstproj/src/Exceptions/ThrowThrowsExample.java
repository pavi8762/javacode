package Exceptions;

import java.util.Scanner;


public class ThrowThrowsExample {
		public void checkValidity(int age) throws ArithmeticException { //this method can throw an ArithmeticException
			if (age < 21) {
				throw new ArithmeticException("You are not eligible to sign up"); 
				//throw an AE when a certain condition is not met. Notice the custom message
			}
			else {
				System.out.println("Congrats! Your account was created successfully!");
			}
		}
		public static void main(String args[]) {
				ThrowThrowsExample t1 = new ThrowThrowsExample();
				char response = 'y';
				Scanner s1 = new Scanner(System.in);
				do {
					System.out.println("Enter your age:");
					String strage = s1.nextLine();
					int age = Integer.parseInt(strage);
					try {
					t1.checkValidity(age);
					}
					catch (ArithmeticException ae) {
						System.out.println(ae.getMessage());
					}
					finally {
					System.out.println("Do you want to continue? (y/n):");
					response  = s1.nextLine().charAt(0);
					}//notice the use of the finally block
					}
				while (response=='y');
				s1.close();
				System.out.println("Bye for now!");
			}
			
	}
