package ObjectsNClasses;

public class Trade {
    private final String id;
    private final String symbol;
    private final int quantity;
    private double price;

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.setPrice(price);

    }

    public Trade(String id, String symbol, int quantity) {
        this(id, symbol, quantity, 1.0);
    }

    public void setPrice(double price) {
        if(price < 0.0)
            throw new IllegalArgumentException("Prices can only be positive values.");
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
