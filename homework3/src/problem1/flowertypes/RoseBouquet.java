package homework3.src.problem1.flowertypes;

import homework3.src.problem1.Flower;

public class RoseBouquet implements Flower{

    @Override
    public double getPrice() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Rose Bouquet";
    }
}
