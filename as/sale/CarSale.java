package Sale;
import Car.Car;
public class CarSale{
	static Car c = new Car();
	public void details(){
		System.out.println("Car\t:\tAudi\nSpeed\t:\t"+c.Speed+"KMPH\nRegular Price\t:"+c.getRegPr()+"\nColour\t:\t"+c.getColor());
	}
	public static void main(String [] args){
		CarSale cs = new CarSale();
		cs.details();
		System.out.println("Sale price after discount : "+ c.getSalePrice());
	}
}