package homework3.src.problem1.flowertypes;

import homework3.src.problem1.Flower;

public class DaisyBouquet implements Flower {
    

    @Override
    public double getPrice() {
        return 15.0;
    }

    @Override
    public String getDescription() {
        return "Daisy Bouquet";
    }
}
