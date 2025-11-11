package homework3.src.problem1.decolators;

import homework3.src.problem1.Flower;
import homework3.src.problem1.FlowerDecorator;

public class GlittersDecorator extends FlowerDecorator{
    public GlittersDecorator(Flower flower){
        super(flower);
    }

    @Override
    public String getDescription(){
        return decolatedFlower.getDescription() + " ... Glitters ...";
    }

    public double getPrice(){
        return decolatedFlower.getPrice() + 8;
    }
}
