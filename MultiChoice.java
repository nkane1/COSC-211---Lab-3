/**
 * Creates a multiple choice question of type TestQuestion
 * 
 * Programmer: Nathan Kane
 * Lab: Project 3
 * Course: COSC 211
 */
import java.util.Scanner;
public class MultiChoice extends TestQuestion {
	
	private int numChoices; 
	private String[] choices;
	private String[] choiceLetters={"a","b","c","d","e","f","g","h","i"};
	
	/*
	 * Fills in the variables for the test questions with input
	 * @see TestQuestion#readQuestion(java.util.Scanner)
	 */
	@Override
	public void readQuestion(Scanner keyboard) {
		numChoices=keyboard.nextInt();
		keyboard.nextLine();
		question=keyboard.nextLine();
		choices = new String[numChoices];
		for (int i=0; i<numChoices; i++)
		{
			choices[i]=keyboard.nextLine();
			question+="\n\t"+choiceLetters[i]+") "+choices[i];
		}
	}
	
	/*
	 * A toString method for the class to represent the question and its 
	 * associated choices.
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return question;
	}
}