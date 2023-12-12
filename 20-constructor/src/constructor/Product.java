package constructor;

public class Product {
	
	//Constructor method
	public Product() {
		System.out.println("Constructor block begin");
	}
	
	//Constructor method with fiels
	public Product(int id, String name, String description, double price, int stockAmount, String colour) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.colour = colour;
	}


	// private encapsulation field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String colour;
	private String code;

	// encapsulation method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCode() {
		// user is prevented from writing code
		return this.name.substring(0, 1) + name;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
