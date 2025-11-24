package problem3;

public class NoCoinsState implements State {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("One coin inserted!");
        machine.setState(new OneCoinState());
    }

    @Override
    public void Buy(VendingMachine machine) {
        System.out.println("You have no coins inserted, please insert a coin.");
    }

    @Override
    public void refill(VendingMachine machine, int bars) {
        machine.addBars(bars);
        System.out.println("There are :" + machine.getChocoratebars() +" Bars");
    }
    
}
