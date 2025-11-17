package problem5.prom;

public class Refund100 implements Promotion {
    

    @Override
    public double applyPromotion(double amount) {
        if(amount >= 500){
            return amount - 100;
        }
        
        return amount;
    }
}
