package problem3;

public class testVendingMachine {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);

        VendingMachine vendingMachine = new VendingMachine(2);
        vendingMachine.insertCoin();
        vendingMachine.pressBuy();
        vendingMachine.insertCoin();
        vendingMachine.pressBuy();

        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.pressBuy();

        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.pressBuy();

        vendingMachine.refill(5);
        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.pressBuy();

    }
}
