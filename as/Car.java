/*1.Write java program on packages (by demonstrate access modifiers)
usecase:Create a super class called Car. The Car class has the following fields and methods.
◦intspeed;
◦doubleregularPrice;
◦Stringcolor;
◦doublegetSalePrice();*/
package Car;
public class Car{
	
	public int Speed;
	protected double regularPrice;
	private String color;
	public Car(){
		Speed = 200;
		regularPrice = 5500000.99;
		color = "Black";
	}
	public double getSalePrice(){
		System.out.println("Applying discout 10% for the regularPrice");
		double dis = regularPrice * 0.1;
		System.out.println("Discount : "+ dis);
		return (regularPrice-dis);
	}
	public String getColor(){
		return color;
	}
	public double getRegPr(){
		return regularPrice;
	}
}