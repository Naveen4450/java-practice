package pack;
import mypack.*;
import java.util.*;
public class Pack
{
	public void display()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius of circle:");
		float r=s.nextFloat();
		Area a=new Area();
		a.area(r);
	}
}