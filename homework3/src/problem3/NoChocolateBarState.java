package problem3;

public class NoChocolateBarState implements State {

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("No chocolate bar available, Cannot accept coins.");
    }

    @Override
    public void Buy(VendingMachine machine) {
        System.out.println("We are out of chocolate bars.");
    }

    @Override
    public void refill(VendingMachine machine, int bars) {
        machine.addBars(bars);
        System.out.println("There are :" + machine.getChocoratebars() +" Bars");
        machine.setState(new NoCoinsState());
    }
    
}
