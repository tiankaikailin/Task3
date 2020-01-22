package Car;

public class Car extends Drive{
	private String brand; 
	private String id;
	public Car(String brand, String id) {
		super();
		this.brand = brand;
		this.id = id;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", id=" + id + "]";
	}
	
	@Override
	public void brand(){
		System.out.println("A " + brand + " Car");
	}
	@Override
	public void type(){
		System.out.println("I'm a Car");
	}
}
