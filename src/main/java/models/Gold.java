package models;

public class Gold implements MembershipType{
    private final int maxTradesPerDay;

    public Gold(int maxTradesPerDay) {
        this.maxTradesPerDay = maxTradesPerDay;
    }

    @Override
    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }

    @Override
    public void displayMembershipTypeInfo() {
        System.out.println("Gold Member: 20 and above points");
    }
}
