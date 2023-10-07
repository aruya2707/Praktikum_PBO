package Exercise3;

//CASE 1
//public class Employee extends Sortable

//CASE 2
  public class Employee implements Sortable{
	public Employee(String n, double s, int day, int month, int year)
	{
		name = n;
		salary = s;
		hiremonth = month;
		hireyear = year;
	}
	
	public void print()
	{
		System.out.println(name + " " + salary + " " + hiremonth + " " + hireday+ " " + hireYear());
	}
	
	public void raiseSalary(double byPercent)
	{
		salary *= 1 + byPercent / 100;
	}
	
	public int hireYear()
	{
		return hireyear;
	}
	
	@Override
	public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }

	//CASE 2
	//menambahkan getter dan setter agar manager dapat akses salary tanpa mengrbah akses salarynya	
	// Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
	
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;

}
