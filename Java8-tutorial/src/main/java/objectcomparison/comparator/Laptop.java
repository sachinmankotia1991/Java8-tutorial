package objectcomparison.comparator;

public class Laptop {

	private String brand;
	private int ram;
	private int price;

	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Laptop [brand=").append(brand).append(", ram=").append(ram).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}
}
