//Q Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;
public class Evenodd
{
  public static void main(String args[])
  {
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
	System.out.println("Enter a number:");
	
	if(num%2==0){
	System.out.println(num+" is even");
}	else{
	System.out.println(num+" is odd");
}
      
  }
}

//output 
/*
Output if number entered is 4
4 is even
*/
