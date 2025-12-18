import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int number, factorial = 1;
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number: ");
		  number = sc.nextInt();
		  
		  if(number<0)
		  {
			  System.out.println("The number is not valid.");
			  return;
		  }
		  else {
			while(number>0)
			{
				factorial *= number;
				number--;
			}
				
		}
		  System.out.println("The factorial is " + factorial);
		  
	}

}