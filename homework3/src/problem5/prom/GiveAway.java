package homework3.src.problem5.prom;

public class GiveAway implements Promotion{
    

    @Override
    public double applyPromotion(double amount) {
        if(amount >= 300){
            System.out.println("Add a free Amazon Echo Dot in shopping cart");
            return amount;
        }
        return amount;
    }
}
