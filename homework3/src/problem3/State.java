package problem3;

public interface State {
    public void insertCoin(VendingMachine machine);
    public void Buy(VendingMachine machine);
    public void refill(VendingMachine machine,int bars);
}
