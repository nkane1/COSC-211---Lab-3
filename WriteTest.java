/**
 * Tests the TestQuestion, Essay, and MultiChoice classes by building a test.
 * 
 * Programmer: Nathan Kane
 * Lab: Project 3
 * Course: COSC 211
 */
import java.util.Scanner;
public class WriteTest {

	public static void main(String[] args) {

		//Declarations
		Scanner keyIn= new Scanner(System.in);
		int testQuestions;
		int numEssays=0;
		int numMulti=0;
		
		//Prompting the user
		System.out.println("Welcome to the test builder. Following is a list "
				+ "of instructions.");
		System.out.println("Please input the requested information and press "
				+ "\"ENTER\" after each.");
		System.out.println("After all the information has been received, your "
				+ "test will be given.");
		System.out.println("The format is:");
		System.out.println("1: The number of test questions on your test.");
		System.out.println("2: The type of question (Please press \"e\" for "
				+ "essay or \"m\" for multiple choice.");
		System.out.println("3: The number of blank spaces if it's an essay or "
				+ "the number of choices if it's a");
		System.out.println("   multiple choice question.");
		System.out.println("4: The test question.");
		System.out.println("5(For multiple choice questions only): Input each "
				+ "choice as its own line.");
		System.out.println("Repeat steps 2-5 until all questions and choices "
				+ "have been submitted.");
		//How many questions will be on the Test.
		testQuestions = keyIn.nextInt();
		TestQuestion[] allQuestions = new TestQuestion[testQuestions];
		
		
		//Turning the input into a TestQuestion array
		for(int i = 0; i<testQuestions; i++){
			String questionType = keyIn.next();
			if (questionType.equals("e")){
				//input e
				numEssays++;
				allQuestions[i] = new Essay();
				allQuestions[i].readQuestion(keyIn);
				allQuestions[i].toString();
			} else {
				//input m
				numMulti++;
				allQuestions[i] = new MultiChoice();
				allQuestions[i].readQuestion(keyIn);
				allQuestions[i].toString();
				
			}
		}
		
		//Print out test
		System.out.println("COSC 211, First Exam, Fall 2015\t\t\t\t\t\t Name: "
				+ "Nathan Kane");
		System.out.println("This test has "+testQuestions+" questions ("
				+numEssays+" Essay and "+numMulti+" Multiple Choice). Please "
				+ "answer all the questions");
		System.out.println("\t\t\t\tGOOD LUCK!!\n");
		for(int j=0; j<testQuestions;j++) 
			System.out.println("Q"+(j+1)+") "+allQuestions[j].toString()+"\n");
	}
}

//SAMPLE:
//	
//INPUT:
//	3
//	e
//	3
//	Why does the constructor of a derived class have to call the constructor of 
//		its parent class?
//	m
//	4
//	Which of the following is not a legal identifier in Java?
//	guess2
//	2ndGuess
//	_guess2_
//	Guess
//	e
//	3
//	Explain the differences between the terms late binding and polymorphism.
//OUTPUT:
//COSC 211, First Exam, Fall 2015						 Name: Nathan Kane
//This test has 1 questions (1 Essay and 0 Multiple Choice). Please answer all the questions
//					GOOD LUCK!!
//
//	Q1) Why does the constructor of a derived class have to call the constructor of its parent class?
//
//
//
//
//
//
//
//	Q2) Which of the following is not a legal identifier in Java?
//		a) guess2
//		b) 2ndGuess
//		c) _guess2_
//		d) Guess
//
//	Q3) Explain the differences between the terms late binding and polymorphism.
