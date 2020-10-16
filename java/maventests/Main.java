package maventests;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class Main {

	public static void main(String[] args) throws NameException {
		

 ArrayList<String> list = new ArrayList<String>();
			list.add("Hi");
		
			try {
					
			list.get(1);
				
			} catch (Exception e) {
				throw new NameException();
				
			}
	}
}