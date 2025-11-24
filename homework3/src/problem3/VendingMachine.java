package problem3;

public class VendingMachine {
    private State state;
    private int numberOfChocolateBars;

    public VendingMachine(int bars) {
        this.numberOfChocolateBars = bars;
        this.state = (numberOfChocolateBars > 0) ? new NoCoinsState() : new NoChocolateBarState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void refill(int bars) {
        state.refill(this, bars);
    }

    public void addBars(int bars) {
        numberOfChocolateBars += bars;
    }

    public int getChocoratebars() {
        return numberOfChocolateBars;
    }

    public void removeChocolateBars() {
        if (numberOfChocolateBars > 0) {
            this.numberOfChocolateBars--;
        } else {
            System.out.println("No more chocolate bars");
        }
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pressBuy() {
        state.Buy(this);
    }
}
