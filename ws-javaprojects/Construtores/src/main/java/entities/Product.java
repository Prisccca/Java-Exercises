package entities;

public class Product {
	
	//public String name;
	//public double price;
	//public int quantity;
	
    String name;
	private double price;
	private int quantity;
	
	//construtor
	public Product(String name, double price, int quantity) {
		this.name = name; // name: atributo do objeto - name :parametro do metodo
		this.price = price;
		this.quantity = quantity;
		
	}
	
	//contructor opcional : sobrecarga
	public Product(String name, double price) {
		this.name = name; // name: atributo do objeto - name :parametro do metodo
		this.price = price;
		//this.quantity = 0; opcional ou quantity = 0;
		
	}
	
	//construtor padrão
	public Product() {
		
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name =name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	
	//regra de negocio : apenas a getquantity para produto
	//para proteger de alterações inconsistentes
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ " , $ "
				+ String.format( "%.2f", price)
				+ " , "
				+ quantity + " unidades, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
