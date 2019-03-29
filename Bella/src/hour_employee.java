import  java.util.Scanner;
public class hour_employee extends Employees{
void hours() {
	
    Scanner input = new Scanner(System.in);
    System.out.println("enter hours worked \n");
    hours= input.nextInt();
     System.out.println("enter salary per hour  \n");
   day_rate= input.nextInt();
    if(hours>8){
        initial_salary= hours*day_rate;
        bonus= initial_salary*5/100;
        final_salary= initial_salary+bonus;
        System.out.println("the employee bonus is:");
        System.out.println(bonus);
        System.out.println("the employee gross salary is:");
       System.out.println(initial_salary);
       System.out.println("the employee net salary is:");
        System.out.println(final_salary);
    }
    else{
        initial_salary =hours*day_rate;
    final_salary= initial_salary;
    System.out.println("the employee gross salary is:");
    System.out.println(initial_salary);
    System.out.println("the employee net salary is:");
     System.out.println(final_salary);
    }
}
}
