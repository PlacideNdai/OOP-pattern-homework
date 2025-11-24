package problem3;

public class testVendingMachine {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);

        machine.insertCoin();
        machine.insertCoin();
        machine.pressBuy();

        machine.insertCoin();
        machine.insertCoin();
        machine.pressBuy();

        machine.pressBuy();

        machine.insertCoin();

        machine.refill(5);

    }
}
