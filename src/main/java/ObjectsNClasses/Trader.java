package ObjectsNClasses;

public class Trader {

    private String name;
    private Account account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void addTrade(Trade trade){
        this.account.setValue(this.account.getValue()
                                    + (trade.getQuantity() * trade.getPrice()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
