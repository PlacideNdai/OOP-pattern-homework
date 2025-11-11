package homework3.src.problem1.decolators;

import homework3.src.problem1.Flower;
import homework3.src.problem1.FlowerDecorator;

public class WrapperDecorator extends FlowerDecorator{
    
    public WrapperDecorator(Flower flower){
        super(flower);
    }


    @Override
    public String getDescription(){
        return decolatedFlower.getDescription() + " ... Paper wrap ...";
    }

    @Override
    public double getPrice(){
        return decolatedFlower.getPrice() + 5;
    }
}
