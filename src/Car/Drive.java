package Car;

public abstract class Drive {
	private String brand; 
	private String id;  
 
 
	public Drive() {}
 
	public Drive(String brand,String id)
	{
		this.brand=brand;
		this.id=id;
	}	
	
	
	public void setBrand(String brand) {
		this.brand=brand; 
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setId(String id) 
	{
		this.id=id; 
	}
	public String getId() {
		return this.id; 
	}
	
	public void price(){
		System.out.println("my price");
	}
}
