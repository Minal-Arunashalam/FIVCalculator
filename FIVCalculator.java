//Minal

import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import java.util.Scanner;

//program to calculate the Future Investment Value
public class FIVCalculator {
	

	public static void main(String args[])
	 {
	     Scanner scanner = new Scanner(System.in);
	       
	     //get the starting value of money
	     System.out.print("Enter present value: ");
		 double presentValue=scanner.nextDouble();
		 
		 //get interest rate of investment
		 System.out.print("Enter the interest rate: ");
		 double interestRate=scanner.nextDouble();
		 
		 //get duration of investment
		 System.out.print("Enter the time period of investment in years: ");
		 double years=scanner.nextInt();
		 
		 //calculate future value of the money
		 double futureValue = presentValue*Math.pow((1+interestRate/100),years);
		 
		 //print future value
		 System.out.print("The future value is: "+ futureValue);
	  }
	}


