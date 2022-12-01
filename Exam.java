package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
		
		Question question1 =  new Question
				(1,"Which is not a Java 8 concept?","method Reference","lambda function","Abstract Class","Streams",3);
		Question question2 =  new Question
				(2,"Which of the following is not a java feature?","Object Oriented","Dynamic","Use of Pointers ","abstraction",3);
		Question question3 =  new Question
				(3,"What is used to find and fix bugs in the Java programs.?","JRE","JVM","JDB","JDK",3);
		Question question4 =  new Question
				(4,"What is the return type of the hashCode() method in the Object class?","int","float","double","boolean",1);
		Question question5 =  new Question
				(5,"What does the expression float a = 35 / 0 return?","Infinity","Runtime Error","Compilation error","0",1);
		
		Question qs[] = {question1,question2,question3,question4,question5};
		
		public boolean showQuestion(int i,Scanner sc)
		{
			System.out.println(qs[i].getQues());
		
			System.out.println(qs[i].getOption1() + "             "+qs[i].getOption2());
			System.out.println(qs[i].getOption3() + "             "+qs[i].getOption4());
			int ans = sc.nextInt();
			if (ans == qs[i].getAnswer())
				return true;
			else
				return false;
		}
		
		
		public static void main(String[] args) {
			
			Exam e = new Exam();
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" Welcome to Exam Are you ready to Start the Exam ? (Y/N)");
			char start = sc.next().charAt(0);
			
			if(start=='Y' ||start=='y')
			{
				for(int i=0;i<e.qs.length;i++)
				{
					boolean rightopt =e.showQuestion(i,sc);
				
					if (rightopt)
					{
						System.out.println(" It is Right Answer..." );
						if(i==(e.qs.length-1))
							System.out.println(" Your Exam completed Successfully.");
						
					}
					else
					{ 
						boolean rightoption = false;
					while(!rightoption)
					{
						System.out.println(" it is a Wrong Answer");
						System.out.println(" do you want to try again? (Y/N)");
	  				    char try1 = sc.next().charAt(0);
						if(try1 == 'y')
						{
							rightoption = e.showQuestion(i,sc);
						 if(rightoption)
							 System.out.println("It is Right Answer..");
						 
							
						}else
							rightoption= true;
					}
						
						
					}
					
				}
				
				
				
			}
			else
			{
				System.out.println("You are not ready to Start Exam ");
			}
			
		
		}

	}
