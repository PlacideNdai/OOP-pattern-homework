package homework3.src.problem1;

public abstract class FlowerDecorator implements Flower {
    protected Flower decolatedFlower;

    public FlowerDecorator(Flower flower){
        this.decolatedFlower = flower;
    }

    @Override
    public double getPrice(){
        return decolatedFlower.getPrice();
    }

    @Override
    public String getDescription(){
        return decolatedFlower.getDescription();
    }


}
