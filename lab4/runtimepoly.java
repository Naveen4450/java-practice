class bank
{
	float getRateOfInterest()
	{
		return 0;	
	}
}
class sbi extends bank
{
	float getRateOfInterest()
	{
		return 3.5f;
	}
}
class icici extends bank
{
	float getRateOfInterest()
	{
		return 2.7f;
	}
}
class axis extends bank
{
	float getRateOfInterest()
	{
		return 4.7f;
	}
}
class runtimepoly
{
	public static void main(String args[])
	{
		bank b;
		b=new sbi();
		System.out.println("Rate of interest in sbi bank="+b.getRateOfInterest()+"%");
		b=new icici();
		System.out.println("Rate of interest in icici bank="+b.getRateOfInterest()+"%");
		b=new axis();
		System.out.println("Rate of interest in axis bank="+b.getRateOfInterest()+"%");
	}
}