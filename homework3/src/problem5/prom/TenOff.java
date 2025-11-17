package problem5.prom;

public class TenOff implements Promotion{
    

    @Override
    public double applyPromotion(double amount) {
        return amount * 0.9;
    }
}
