package models;

import java.time.LocalTime;

public class Bronze implements MembershipType{
    private int maxTradesPerDay;
    private LocalTime restrictionTime;

    public Bronze(int maxTradesPerDay) {
        this.maxTradesPerDay = maxTradesPerDay;
    }

    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }

    public void setMaxTradesPerDay(int maxTradesPerDay) {
        this.maxTradesPerDay = maxTradesPerDay;
    }


    @Override
    public void displayMembershipTypeInfo() {
        System.out.println("Bronze member: less than 10 points");
    }
}
