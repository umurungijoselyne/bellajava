import java.util.Scanner;
public class week_employee extends Employees{
void week() {
	
	Scanner input= new Scanner(System.in);
    System.out.println("Enter days worked in weeks:");
    days= input.nextInt();
    System.out.println("Enter salary for  day :");
    day_rate= input.nextInt();
    initial_salary= days*day_rate;
    final_salary= initial_salary;
    System.out.println("the employee gross salary is:");
    System.out.println(initial_salary);
    System.out.println("the employee net salary is:");
     System.out.println(final_salary);
}
}
