package com.question4;

public class TestMain {
	
	public static void main(String[] args) {
		Candidate candidate1 = new Candidate();
		Candidate candidate2 = new Candidate();
		Candidate candidate3 = new Candidate();
		Candidate candidate4 = new Candidate();
		
		try {
			candidate1.validateCandidate("saba",30,"btech");
			candidate2.validateCandidate("sunita",30,"hr");
			candidate3.validateCandidate("shina",25,"btech");
			candidate4.validateCandidate("saba",50,"btech");
		}
		catch(Exception e)
		{
			System.err.print(e.getMessage());
		}	
	}

}
