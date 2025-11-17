package problem4;

public class Bidder implements Observer {

    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    public void bid(Product product, double bidPrice) {
        product.placeBid(this, bidPrice);
    }

    @Override
    public void update(String bidderName, double bidPrice, String productName) {
        if (bidderName.equals(this.name)) {
            System.out.println("Hello " + name + "! New bid of amount " + bidPrice +
                    " has been placed on " + productName + " by you");
        } else {
            System.out.println("Hello " + name + "! New bid of amount " + bidPrice +
                    " has been placed on " + productName + " by " + bidderName);
        }
    }

    public String getName() {
        return name;
    }
}
