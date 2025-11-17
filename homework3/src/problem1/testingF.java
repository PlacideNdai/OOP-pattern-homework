package problem1;

import problem1.decolators.BalloonDecorator;
import problem1.decolators.CardDecorator;
import problem1.decolators.GlittersDecorator;
import problem1.decolators.WrapperDecorator;
import problem1.flowertypes.RoseBouquet;



public class testingF {
    public static void main(String[] args) {
        Flower rose = new RoseBouquet();

        rose = new CardDecorator(rose);
        rose = new BalloonDecorator(rose);
        rose = new GlittersDecorator(rose);
        rose = new WrapperDecorator(rose);
        System.out.println(rose.getDescription() + " price is $" + rose.getPrice());
    }
}
