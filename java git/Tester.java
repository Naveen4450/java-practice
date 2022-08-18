import java.util.concurrent.*;
public class Tester {
	public static void main(String[] args)
	{
		ConcurrentHashMap chm = new ConcurrentHashMap();
		chm.put(1,"Welcome");
		chm.put(2,"to");
		chm.put(3,"java");
		chm.put(4,"World");
		chm.putIfAbsent(3,"world");
		System.out.println("Elements: "+chm);
		chm.remove(2,"Welcome");
		System.out.println("Elements after key 2 is removed: "+chm);
		chm.putIfAbsent(3,"java's");
		System.out.println("Add new: "+chm);
		chm.replace(3,"Java","java New");
		System.out.println("After Replacing: "+chm);
	}
}
