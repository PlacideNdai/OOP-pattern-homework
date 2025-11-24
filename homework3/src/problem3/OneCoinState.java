package problem3;

public class OneCoinState implements State{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Two coin inserted!");
        machine.setState(new TwoCoinsState());
    }

    @Override
    public void Buy(VendingMachine machine) {
        System.out.println("You have one coin inserted, please insert another coin.");
    }

    @Override
    public void refill(VendingMachine machine, int bars) {
        machine.addBars(bars);
        System.out.println("There are :" + machine.getChocoratebars() +" Bars");
    }
    
}
