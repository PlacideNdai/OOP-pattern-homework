package problem5;

import java.util.Arrays;
import java.util.List;

import problem5.prom.GiveAway;
import problem5.prom.Refund100;
import problem5.prom.TenOff;

public class testpromotion {
    public static void main(String[] args) {
        List<CartItem> list = Arrays.asList(
                new CartItem("iPhone 10", 1, 40),
                new CartItem("Vizio TV", 2, 500),
                new CartItem("Tesla", 1, 50));
        ShoppingCart shoppingCart = new ShoppingCart(list);
        // write your code here for strategy 1
        shoppingCart.setPromotion(new TenOff());
        // end of your code
        shoppingCart.checkout();

        // write your code here for strategy 2
        shoppingCart.setPromotion(new Refund100());
        // end of your code
        shoppingCart.checkout();
        // write your code here for strategy 3
        shoppingCart.setPromotion(new GiveAway());
        // end of your code
        shoppingCart.checkout();
    }
}
