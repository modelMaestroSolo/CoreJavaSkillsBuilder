package models;

public class BondTrade extends Trade{

    private double dividend;

    public BondTrade(String id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.setDividend(dividend);
    }

    public BondTrade(String id, String symbol, int quantity, double dividend) {
        super(id, symbol, quantity);
        this.setDividend(dividend);
    }

    public void setDividend(double dividend) {
        if(dividend < 0)
            throw new IllegalArgumentException("dividend cannot be negative!");
        this.dividend = dividend;
    }

    @Override
    public double calcDividend() {
        return dividend;
    }
}
