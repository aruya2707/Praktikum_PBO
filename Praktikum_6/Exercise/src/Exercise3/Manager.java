package Exercise3;
import java.util.Calendar;
import java.util.GregorianCalendar;

//public class Manager extends Employee
//CASE 2 class Managers extends Employee extends Sortable
public class Manager extends Employee implements Sortable{
	public Manager(String n, double s, int d, int m, int y)
	{
		super(n, s, d, m, y);
		secretaryName = "";
	}
	
	public void raiseSalary(double byPercent)
	{
		// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	//CASE2
	// Implementasi metode compare untuk Manager
	public int compare(Sortable b) {
	    if (b instanceof Manager) {
	        Manager mb = (Manager) b;
	        // Membandingkan berdasarkan gaji Manager saat ini dengan gaji Manager lain
	        if (super.getSalary() < mb.getSalary()) {
	            return -1;
	        } else if (super.getSalary() > mb.getSalary()) {
	            return 1;
	        } else {
	            return 0;
	        }
	    } else if (b instanceof Employee) {
	        Employee eb = (Employee) b;
	        // Membandingkan berdasarkan gaji Manager saat ini dengan gaji Employee lain
	        if (super.getSalary() < eb.getSalary()) {
	            return -1;
	        } else if (super.getSalary() > eb.getSalary()) {
	            return 1;
	        } else {
	            return 0;
	        }
	    } else {
	        throw new IllegalArgumentException("Object is not an instance of Manager or Employee");
	    }
	}

	
	public String getSecretaryName()
	{ 
		return secretaryName;
	}
	
	private String secretaryName;

}
