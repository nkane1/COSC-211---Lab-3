/** Abstract class establishing that test questions exist
 * 
 * Programmer: Nathan Kane
 * Lab: Project 3
 * Course: COSC 211
 */
import java.util.Scanner;
public abstract class TestQuestion {
	protected String question;
	protected static int number;
	public abstract void readQuestion(Scanner keyboard);
}