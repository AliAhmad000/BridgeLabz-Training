import java.util.Scanner;
public class BonusOfEmployee{
    public static void main(String args[]){
       int bonus = 5, yearsOfService, salary, bonusAmount;

       Scanner sc = new Scanner(System.in);
       // Taking Input 
       System.out.println("Enter the employee salary: ");
       salary = sc.nextInt();
       System.out.println("Enter the employee's years of service: ");
       yearsOfService = sc.nextInt();

       if(yearsOfService>5)
       { 
           bonusAmount = (salary/100) * 5;
           System.out.println("The bonus amount is " + bonusAmount); 
       }
       else{
           System.out.println("Bonus is not provided.");          
       }
    }
}