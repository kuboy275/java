package DOAN;


public class Drinks {
	
	String name;
	int price;

//	constructor
	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void displayDrinks() {
		System.out.println(name + " - " + price + " $" );
	}

}
