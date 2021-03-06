package starhide.maze;

/**
 * Thrown when the size of the maze is over 9000!!!!!!!!!
 * 
 * @author Blake Bauer
 * @version CS162 Final Project 2016.06.02
 */
public class LargeSizeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5224027985785963922L;

	/**
	 * Constructor for objects of class LargeSizeException
	 */
	public LargeSizeException() {
		super("Size is over 9000!");
	}

}
