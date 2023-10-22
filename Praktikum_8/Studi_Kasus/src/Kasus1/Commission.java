package Kasus1;

public class Commission extends Hourly 
{
	private double totalSales;
	private double commission_rate;
	
	public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commission_rate) 
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commission_rate = commission_rate;
	}
	
	public void addSales(double totalSales)
	{
		this.totalSales += totalSales;
	}
	
	@Override
	public double pay()
	{
	    double basePay = super.pay();
	    double commissionPay = totalSales * commission_rate;
	    totalSales = 0;
	    
	    return basePay + commissionPay ;
	}
	
	//----------------------------------------------------------
	//  Returns information about this hourly employee as a
	//  string.
	//----------------------------------------------------------
	@Override
	public String toString()
	{
		String result = super.toString();

		result += "\nTotal Sales: " + totalSales;

		return result;
	}
}
