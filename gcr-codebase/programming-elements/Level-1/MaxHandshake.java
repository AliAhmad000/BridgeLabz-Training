import java.util.Scanner;
public class MaxHandshake{
    public static void main(String args[]){
       
      Scanner sc = new Scanner(System.in);
      
      // Taking input
      System.out.println("Enter the number of students: ");
      int numberOfStudents = sc.nextInt();
      int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
     
      // Printing Output
      System.out.println("The maximum number of handshakes among " + numberOfStudents + " number of students is " + maxHandshakes);
      }
}