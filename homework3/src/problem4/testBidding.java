package problem4;

import java.math.BigDecimal;

public class testBidding {
    public static void main(String[] args) {
        Product iPhone12 = new Product("iPhone 12", new BigDecimal(999.99));

        Bidder bidder1 = new Bidder("Bidder 1");
        Bidder bidder2 = new Bidder("Bidder 2");
        Bidder bidder3 = new Bidder("Bidder 3");

        iPhone12.subscribe(bidder1);
        iPhone12.subscribe(bidder2);
        iPhone12.subscribe(bidder3);

        bidder1.bid(iPhone12, 1000.00);
        bidder2.bid(iPhone12, 1200.00);
        bidder3.bid(iPhone12, 1300.00);
    }
}
