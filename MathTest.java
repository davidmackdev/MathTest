/*
Author:	David
Date:	08/02/19
File:	MathTest.java

Practice using Math methods 

a. The square root of 37
b. The sine and cosine of 300
c. The value of the floor, ceiling, and round of 22.8
d. The larger and the smaller of the character 'D' and the integer 71
e. A random number between 0 and 20
*/

import java.util.Scanner;

public class MathTest
{
	public static void main(String[] args) 
	{
		double squareRoot = Math.sqrt(37);
		double sine = Math.sin(300);
		double cosine = Math.cos(300);
		int floor = Math.floor(28.8);
		int ceiling = Math.ceil(28.8);
		int round = Math.round(28.8);
		int lowerCase = 'd';
		int upperCase = 'D';
		int max = Math.max(71, upperCase);
		int min = Math.min(71, lowerCase);
		int randNum = Math.random() * 21;	

		System.out.println("The square root of 37 is " + squareRoot);
		System.out.println("The sine of 300 is " + sine);
		System.out.println("The cosine of 300 is " + cosine);
		System.out.println("The floor of 28.8 is " + floor);
		System.out.println("The ceiling of 28.8 is " + ceiling);
		System.out.println("The round of 28.8 is " + round);
		System.out.println("The max of 'D' and 71 is " + max);
		System.out.println("The min of 'D' and 71 is " + min);	
		System.out.println("Here is a random number between 0 and 20 " + randNum);
	}	
}