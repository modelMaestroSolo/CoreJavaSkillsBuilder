package models;

import java.time.LocalTime;

public class Client {
    private String firstName;
    private String lastName;
    private int points;
    private int totalTrades;
    private MembershipType membershipType;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalTrades = 0;
        this.points = 0;
        this.membershipType = null;
    }

    public void addTrade(){}

    public boolean canTrade(){
        if(membershipType instanceof Bronze) {
            return totalTrades < membershipType.getMaxTradesPerDay() &&
                    LocalTime.now().isBefore(LocalTime.of(10, 0));
        } else if(membershipType instanceof Silver) {
            return totalTrades < membershipType.getMaxTradesPerDay();
        } else {
            return totalTrades < membershipType.getMaxTradesPerDay();
        }

    }

    public void trade(){
        this.points += 1;
        this.totalTrades += 1;
        this.updateMembership();
    }

    private void updateMembership(){
        if(this.points < 10){
            this.membershipType = new Bronze(5);
        }else if(this.points < 20){
            this.membershipType = new Silver(10, 10_000);
        }else {
            this.membershipType = new Gold(20);
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayTrades() {
        return totalTrades;
    }

    public void setDayTrades(int totalTrades) {
        this.totalTrades = totalTrades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }
}
