package org.javamentor.java.practice.exception;

/**
 * A sample custom unchecked/runtime exception class
 * 
 * @author dhruba(@javamentor-lab)
 *
 */
public class SampleRuntimeException extends RuntimeException {
	/**
	 * default serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor with error message
	 * 
	 * @param msg
	 */
	public SampleRuntimeException(String msg) {
		super(msg);
	}
	
	/**
	 * Constructor with a numeric error code and error message
	 * 
	 * @param code
	 * @param msg
	 */
	public SampleRuntimeException(int code, String msg) {
		super("Error:"+code + " " + msg);
	}
}
