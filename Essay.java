/**
 * Creates an essay question of type TestQuestion
 * 
 * Programmer: Nathan Kane
 * Lab: Project 3
 * Course: COSC 211
 */
import java.util.Scanner;
public class Essay extends TestQuestion{
	private int numOfBlank;
	
	/*
	 * Fills in the variables for the test questions with input
	 * @see TestQuestion#readQuestion(java.util.Scanner)
	 */
	@Override
	public void readQuestion(Scanner keyboard) {
		numOfBlank=keyboard.nextInt();
		keyboard.nextLine();
		question=keyboard.nextLine();
	}
	/*
	 * A toString method for the class to represent the question and its 
	 * associated number of spaces.
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		for (int i=0; i<numOfBlank; i++)
			question+="\n";
		return question;
	}
}
