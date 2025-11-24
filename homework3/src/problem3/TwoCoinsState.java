package problem3;

public class TwoCoinsState implements State {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Two coins inserted already, press buy!");
    }

    @Override
    public void Buy(VendingMachine machine) {
        if(machine.getChocoratebars() > 0){
            System.out.println("You bought a chocolate bar.");
            machine.setState(new NoCoinsState());
            machine.removeChocolateBars();

            if(machine.getChocoratebars() == 0){
                machine.setState(new NoChocolateBarState());
            }
        } else {
            machine.setState(new NoChocolateBarState());
        }
    }

    @Override
    public void refill(VendingMachine machine, int bars) {
        machine.addBars(bars);
        System.out.println("There are :" + machine.getChocoratebars() +" Bars");
    }
    
}
