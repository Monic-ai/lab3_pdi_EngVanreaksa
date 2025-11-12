package lab03;

public class Book {
	private float id;
    private String Title;
    private String Author;
    private float price;

    public Book(float id, String Title, String Author, float price) {
        this.id = id;
        this.Title = Title;
        this.Author = Author;
        this.price = price;
    }
    
    public float getprice() {
    	return price;
    }

    public String toString() {
        return "ID: " + id + ", \nTitle: " + Title + "\nAuthor: " + Author + "\nPrice: $" + price;
    }

}
