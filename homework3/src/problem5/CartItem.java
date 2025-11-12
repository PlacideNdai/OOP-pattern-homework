package homework3.src.problem5;

public class CartItem {
    public String name;
    public double price;
    private int numberOfItems;

    public CartItem(String name, double price, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.numberOfItems = numberOfItems;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
