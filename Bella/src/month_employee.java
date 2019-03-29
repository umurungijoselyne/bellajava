import java.util.Scanner;
public class month_employee extends Employees {
	 void month(){
	        Scanner input = new Scanner(System.in);
	    
	    System.out.println("enter the salary");
	      initial_salary = input.nextInt();
	      
	      tax = initial_salary*25/100;
	      rssb = initial_salary*5/100;
	      final_salary=initial_salary-tax-rssb;
	      System.out.println("the employee salary before deductions is:\n");
	      System.out.println(initial_salary);
	      System.out.println("the employee net salary after deductions is:\n");
	       System.out.println(final_salary);

}}
