package Exercise3;

public class EmployeeTest {
	public static void main(String[] args) 
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Antonio Rosii", 2000000, 1, 10, 1989);
		staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
//		int i;
//		for(i = 0; i < 3; i++) staff[i].raiseSalary(i);
//		for(i = 0; i < 3; i++) staff[i].print();
		//CASE 1
//		Employee[] staff = new Employee[3];
//		 staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
//		 staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
//		 staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
//	        Sortable.shell_sort(staff);

	    // Explicitly call the compare method and print the results
	    for (int i = 0; i < staff.length - 1; i++) 
	    {
	         int result = staff[i].compare(staff[i + 1]);
	         System.out.println("Comparison result: " + result);
	    }
	        
	    // Print the sorted staff array
	    for (Employee employee : staff) 
	    {
	            employee.print();
	    }
	}
}
