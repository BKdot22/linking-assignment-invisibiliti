package com.rutgers.pm2;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProblemFour pb4 = new ProblemFour();
		System.out.println(pb4.ProblemFourA("what the?"));
		
		int[][] tempInt = {
			{ 1, 2 },
			{ 3, 4 },
			{ 4, 5 },
			{ 0, 3 }
		};
				
		pb4.ProblemFourB(tempInt, 5);
	}

}
