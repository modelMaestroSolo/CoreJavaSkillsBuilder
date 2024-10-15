package models;

public class FundTrade extends Trade{

    private double dividendPercentage;

    public FundTrade(String id, String symbol, int quantity, double price, double dividendPercentage) {
        super(id, symbol, quantity, price);
        this.setDividend(dividendPercentage);
    }

    public FundTrade(String id, String symbol, int quantity, double dividend) {
        super(id, symbol, quantity);
        this.setDividend(dividend);
    }

    @Override
    public double calcDividend() {
        return (this.dividendPercentage / 100) * this.getPrice();
    }

    public void setDividend(double dividendPercentage) {
        if(dividendPercentage < 0)
            throw new IllegalArgumentException("Dividend Percentage cannot be negative!");
        this.dividendPercentage = dividendPercentage;
    }
}
