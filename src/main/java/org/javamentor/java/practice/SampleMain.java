package org.javamentor.java.practice;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.javamentor.java.practice.exception.SampleCheckedException;
import org.javamentor.java.practice.exception.SampleRuntimeException;

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
	 * @throws SampleCheckedException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws SampleCheckedException {
		displayBanner();
		System.out.println("*******Sample Maven App is Working*******");
	}
	

	/**
	 * Displays the "Java Mentor" banner at the top of the output console
	 * @throws SampleCheckedException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private static void displayBanner() throws SampleCheckedException {
		try (InputStream inputStream = SampleMain.class.getResourceAsStream("/banner.txt");
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			reader.lines().forEach(line->System.out.println(line));
		} catch (RuntimeException re) {
			throw new SampleRuntimeException(100, "Runtime Exception Occurred");
		} catch (Exception e) {
			throw new SampleCheckedException(101, "Checked Exception Occurred");
		}
	}

}
