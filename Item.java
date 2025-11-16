package lab03;

public class Item {
	private float id;
    private String name;
    private float price;

    public Item(float id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public float getprice() {
    	return price;
    }

    public String toString() {
        return "ID: " + id + ", \nItem name: " + name + "\nPrice: $" + price;
    }

}
