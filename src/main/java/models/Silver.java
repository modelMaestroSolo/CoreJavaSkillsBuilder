package models;

public class Silver implements MembershipType{
    private int maxTradesPerDay;

    private double maxTradeValue;

    public Silver(int maxTradesPerDay, double maxTradeValue) {
        this.maxTradesPerDay = maxTradesPerDay;
        this.maxTradeValue = maxTradeValue;
    }

    @Override
    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }

    public void setMaxTradesPerDay(int maxTradesPerDay) {
        this.maxTradesPerDay = maxTradesPerDay;
    }

    public double getMaxTradeValue() {
        return maxTradeValue;
    }

    public void setMaxTradeValue(double maxTradeValue) {
        this.maxTradeValue = maxTradeValue;
    }

    @Override
    public void displayMembershipTypeInfo() {
        System.out.println("Silver Member: between 10 - 19 points");
    }
}
