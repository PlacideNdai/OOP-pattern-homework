package homework3.src.problem1.decolators;

import homework3.src.problem1.Flower;
import homework3.src.problem1.FlowerDecorator;

public class BalloonDecorator extends FlowerDecorator{
    public BalloonDecorator(Flower flower){
        super(flower);
    }

    @Override
    public double getPrice(){
        return decolatedFlower.getPrice() + 7;
    }

    @Override
    public String getDescription(){
        return decolatedFlower.getDescription() + " ... Balloon ...";
    }
}
