package Car;

public class Bus extends Drive{
	private String brand; 
	private String id;
	public Bus(String brand, String id) {
		super();
		this.brand = brand;
		this.id = id;
	}
	public Bus() {
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
		return "Bus [brand=" + brand + ", id=" + id + "]";
	}  
	
	public void price(){
		System.out.println("I'm a " + brand + " Bus");
	}
	
}
