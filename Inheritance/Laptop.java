class Book{
	private int id;
	private String brandName;
	private int capacity;
	private double price;
	
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setBrandName(String brandName){
		this.brandName=brandName;
	}
	public String getBrandName(){
		return this.brandName;
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public int getCapacity(){
		return this.capacity;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return this.price;
	}
}