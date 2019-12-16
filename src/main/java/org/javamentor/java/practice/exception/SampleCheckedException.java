package org.javamentor.java.practice.exception;

/**
 * A sample custom checked exception class
 * 
 * @author dhruba(@javamentor-lab)
 *
 */
public class SampleCheckedException extends Exception {
	/**
	 * default serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor with error message
	 * 
	 * @param msg
	 */
	public SampleCheckedException(String msg) {
		super(msg);
	}
	
	/**
	 * Constructor with a numeric error code and error message
	 * 
	 * @param code
	 * @param msg
	 */
	public SampleCheckedException(int code, String msg) {
		super("Error:"+code + " " + msg);
	}
}
