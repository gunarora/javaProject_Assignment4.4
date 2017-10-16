/*Write a program to find the aliquot sum of a given number.
Hint: The aliquot divisors of a number are all its divisors except the number itself. The aliquot
sum is the sum of the aliquot divisors.
For example, the aliquot divisors of 12 are 1, 2, 3, 4, and6 and its aliquot sum is 16. Extend this
program to check if given number is a perfect number or not. If a number equals to its aliquot
sum, then it is a perfect number. Print all perfect numbers between 1 to 100.*/

package javaProject_Assignment4; //Package declaration is mandatory

//Importing scanner class for taking input from user
import java.util.Scanner;

public class test {
	//Method to get perfect numbers between 1 and 100	
	 public void isNumPerfect() {
		 //declaring variables
		 int n1 = 100,sum = 0;
		 //logic applied
		 for(int num = 1; num <= n1; num++)
		    {
		    sum = 0;
		    for(int i = 1; i < num; i++)
		    {
		       if((num%i) == 0)
		       {
		          sum+=i;
		       }
		    }
		    //if sum equals to number given then number is perfect number
		    if(sum == num)
		    {
		    	 System.out.print(num + " is perfect number between 1 to 100" + System.lineSeparator() );
		    }
		   
		    }
	 }

	 //main method initiated
	public static void main(String[] args) {
		//object created
		test objtest = new test();
		
		
	  System.out.println("Enter number");
	  //object initialized for user input
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(), i;
		//Divisor of number will always be 1 
		 System.out.print("Divisors of " + num + " = 1");
		 //logic applied to get others numbers except 1 and number itself
	        for (i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                System.out.print(" , " +i);
	            }
	        }

	        /*To get sum of divisors*/
	        //Declare object
	        int sum = 1;
	        //find divisor and sum up them
	    	     for (int a = 2; a<= num / 2; a++){
	    	 if (num % a == 0) {
	         sum = sum + a;
	    	 }
	     }
	    	     //print sum of divisors
	     System.out.println(System.lineSeparator() +"Sum of aliquot divisor = " +  sum);
	     
	     ////Print perfect no
	     //if sum equals to number given then number is perfect number
	     if(num == sum)
	     {
	    	 System.out.println("It's a perfect number");
	     }
	     else 
	     {
	         System.out.println("It is not a perfect number");
	     }
	     
	     //Calling method
	     objtest.isNumPerfect();
	     
	     //close scanner and release references
	        sc.close();
	}

}
