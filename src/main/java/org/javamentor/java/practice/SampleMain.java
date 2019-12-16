package org.javamentor.java.practice;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Sample class containing main method to be used as template for creating other classes/projects
 * 
 * @author DHRUBA
 *
 */
public class SampleMain {

	/**
	 * The entry point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		displayBanner();
		System.out.println("*******Sample Maven App is Working*******");
	}
	

	/**
	 * Displays the "Java Mentor" banner at the top of the output console
	 */
	private static void displayBanner() {
		try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/banner.txt"))) {
			reader.lines().forEach(line->System.out.println(line));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
