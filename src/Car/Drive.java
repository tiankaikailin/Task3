package Car;

public class Drive {
	private String brand; 
	private String id;  
 
	
	
	public Drive(String brand, String id) {
		super();
		this.brand = brand;
		this.id = id;
	}

	public Drive() {
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
		return "Drive [brand=" + brand + ", id=" + id + "]";
	}

	public void brand(){
		System.out.println("my brand");
	}
	
	public void type(){
		System.out.println("I'm Drive");
	}
}
