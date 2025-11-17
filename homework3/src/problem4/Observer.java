package problem4;

public interface Observer {
    void update(String bidderName, double bidPrice, String productName);
    String getName();
}
