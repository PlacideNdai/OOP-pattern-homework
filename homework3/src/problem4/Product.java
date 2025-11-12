package homework3.src.problem4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product implements Subject{
    private String name;
    private BigDecimal price;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Product(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String bidderName, double bidPrice) {
        System.out.println("------------- New bid placed -------------");
        for(Observer observer : observers){
            observer.update(bidderName, bidPrice, name);
        }
    }

    public void placeBid(Observer observer, double bidPrice){
        this.price = new BigDecimal(bidPrice);
        notifyObservers(observer.getName(), bidPrice);
    }
}
