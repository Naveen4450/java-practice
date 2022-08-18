import mypack.Area;
import java.util.*;
public class One
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		float r=s.nextFloat();
		Area a=new Area();
		a.area(r);
		a.circumference(r);
		a.diameter(r);
	}
}