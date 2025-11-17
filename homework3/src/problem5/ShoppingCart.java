package problem5;

import java.util.List;

import problem5.prom.Promotion;

public class ShoppingCart {
    private List<CartItem> items;
    private double totalPrice;
    private Promotion promotionStrategy;

    public ShoppingCart(List<CartItem> items){
        this.items = items;
    }

    public void setPromotion(Promotion promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void checkout(){
        totalPrice = 0;
        for(CartItem item : items){
            totalPrice += item.getPrice() * item.getNumberOfItems();
        }

        if(promotionStrategy != null){
            totalPrice = promotionStrategy.applyPromotion(totalPrice);
        }

        System.out.println("Total price: " + totalPrice);
    }
}
