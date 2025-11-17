package problem1.flowertypes;

import problem1.Flower;

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
