class typesofconstructors
{
	typesofconstructors()
	{
		System.out.println("this is default constructor");
	}
	typesofconstructors(int n)
	{
		System.out.println("n value="+n);
		System.out.println("in parameterizied constructor");
	}
	public static void main(String args[])
	{
		typesofconstructors t1=new typesofconstructors();
		typesofconstructors t2=new typesofconstructors(10);
	}
}