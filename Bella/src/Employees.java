import java.util.Scanner;
public class Employees {
	int days;
	int initial_salary;
	int final_salary;
	int hours;
	int bonus;
	int tax;
	int rssb;
	int day_rate;
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String name;
		int ID;
	    String type;
		System.out.println("Provide employee name");
		name = input.next();
		System.out.println("Provide employee number");
		ID = input.nextInt();
		
		System.out.println("Choose the type of employee:\n day \n month \n week");
		type = input.next();
		switch(type) {
		case "day":
			  hour_employee net = new hour_employee();
	           net.hours();
	          break;
		case "month":
			 month_employee nets = new month_employee();
	          nets.month();
	          break;
		case "week":
			 week_employee netd = new week_employee();
	           netd.week();
	           break;
		}
	}

}
