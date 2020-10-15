package maventests;

import java.util.Scanner;

import org.junit.Test;

public class Main {

	public static void main(String[] args) throws Exception {
		

 String person = "Kris";
			
			try {
				for(int i = 0; i <person.length(); i++) {
					System.out.println(person.length());
				}
				if(person.length() > 5) {
				throw new Exception();
				}
				else {
					throw new Exception();
						//System.out.println("Length of Name.");
					}
				} catch (Exception e) {
					System.out.println("Out of bounds");
			}
	}
}