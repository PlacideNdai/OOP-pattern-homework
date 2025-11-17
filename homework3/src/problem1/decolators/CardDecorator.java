package problem1.decolators;

import problem1.Flower;
import problem1.FlowerDecorator;

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
