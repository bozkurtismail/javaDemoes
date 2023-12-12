package constructor;

public class Main {

	public static void main(String[] args) {
		
		//new Product
		Product product = new Product();

		product.setId(1);
		product.setName("Laptop");
		product.setDescription("HP Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		System.out.println(product.getCode());
		
		
		//new Product2
		Product product2 = new Product(2,"Laptop","Asus Laptop",3000,5,"Black");//Constructor use
		productManager.add(product2);
		
	}

}
