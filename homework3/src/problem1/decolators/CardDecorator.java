package homework3.src.problem1.decolators;

import homework3.src.problem1.Flower;
import homework3.src.problem1.FlowerDecorator;

public class CardDecorator extends FlowerDecorator {
    public CardDecorator(Flower flower){
        super(flower);
    }

    @Override
    public String getDescription(){
        return decolatedFlower.getDescription() + " ... Card ...";
    }

    @Override
    public double getPrice(){
        return decolatedFlower.getPrice() + 6;
    }
}
