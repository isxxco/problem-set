/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class ProblemSet2 {
	private static Scanner in = new Scanner(System.in);
	
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		in.close();
	}
	
	public void sayHello() {
		System.out.println("Enter your first name");
		String first = in.nextLine();
		System.out.println("Enter your last name");
		String last = in.nextLine();
		System.out.println("Hello, " + first + " " + last + "!");
	}
	
	public void gradeMe() {
		System.out.println("Insert homework grade #1");
		double hw1 = in.nextDouble();
		in.nextLine();
		System.out.println("Insert homework grade #2");
		double hw2 = in.nextDouble();
		in.nextLine();
		System.out.println("Insert homework grade #3");
		double hw3 = in.nextDouble();
		in.nextLine();
		double hw = (hw1 + hw2 + hw3)/3;
		System.out.println("Insert quiz grade #1");
		double q1 = in.nextDouble();
		in.nextLine();
		System.out.println("Insert quiz grade #2");
		double q2 = in.nextDouble();
		in.nextLine();
		System.out.println("Insert quiz grade #3");
		double q3 = in.nextDouble();
		in.nextLine();
		double q = (q1 + q2 + q3)/3;
		System.out.println("Insert test grade #1");
		double t1 = in.nextDouble();
		in.nextLine();
		System.out.println("Insert test grade #2");
		double t2 = in.nextDouble();
		in.nextLine();
		System.out.println("Insert test grade #3");
		double t3 = in.nextDouble();
		in.nextLine();
		double t = (t1 + t2 + t3)/3;
		double average = ((.15 * hw) + (.30 * q) + (.55 * t));
		DecimalFormat avg = new DecimalFormat("##0.00");
		System.out.println("Your average is: " + avg.format(average) + "%!");
	}
	
	public void groupUs() {
		System.out.println("Insert the number of students attending trip:");
		int students = in.nextInt();
		in.nextLine();
		System.out.println("insert the number of teachers attending trip:");
		int teachers = in.nextInt();
		in.nextLine();
		int total = teachers + students;
		int busCount;
		if (total % 47 != 0)	{
			int primarybus = total/47;
			busCount = primarybus + 1;
			int finalbus = total % 47;
		System.out.println("The amount of full 47 person buses we need is " + primarybus + " and the final bus has " + finalbus + " people");
		}
		else {
			int primarybus = total / 47;
		System.out.println("The amount of full 47 person buses we need is " + primarybus + ".");
		}
		
	}
	
	public void info() {
        System.out.println("What is your first name?");
        String first = in.nextLine();
        System.out.println("What is your last name?");
        String last = in.nextLine();
        System.out.println("What grade are you in?");
        int grade = in.nextInt();
        in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("what is the name of your hometown?");
        String home = in.nextLine();
        System.out.println("Name      :" + first + " " + last + "\nGrade     :" + grade + "\nAge       :" + age + "\nHometown  :" + home);	
	}
	
	public void initials() {
		System.out.println("Please enter your first name:");
        char first = in.nextLine().charAt(0);
		System.out.println("Please enter your middle name:");
        char middle = in.nextLine().charAt(0);
		System.out.println("Please enter your last name:");
        char last = in.nextLine().charAt(0);
        System.out.println("Your initials are " + first + middle + last);
        in.close();
	}
}