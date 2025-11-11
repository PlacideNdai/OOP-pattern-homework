package homework3.src.problem1;

import homework3.src.problem1.decolators.BalloonDecorator;
import homework3.src.problem1.decolators.CardDecorator;
import homework3.src.problem1.decolators.GlittersDecorator;
import homework3.src.problem1.decolators.WrapperDecorator;
import homework3.src.problem1.flowertypes.RoseBouquet;

public class testingFlowers {
    public static void main(String[] args) {
        Flower rose = new RoseBouquet();

        rose = new CardDecorator(rose);
        rose = new BalloonDecorator(rose);
        rose = new GlittersDecorator(rose);
        rose = new WrapperDecorator(rose);
        System.out.println(rose.getDescription() + " price is $" + rose.getPrice());
    }
}
