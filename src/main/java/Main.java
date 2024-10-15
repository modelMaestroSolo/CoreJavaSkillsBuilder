import models.Account;
import models.BondTrade;
import models.Trade;
import models.Trader;

public class Main {
    public static void main(String[] args) {
        ObjectsNClasses();
    }


    public static void ObjectsNClasses(){
        System.out.println("Objects and Classes");
        System.out.println("******************************");
       // Trade trade = new Trade("1", "GOOGL", 10, 12.0);
        Trade trade = new BondTrade("1", "GOOGL", 10, 12,30.0);
        System.out.printf("trade has quantity %d and price %f.%n",
                           trade.getQuantity(),
                            trade.getPrice());

        Account account = new Account();
        account.setValue(10.0);
        System.out.printf("account has initial value %f.%n", account.getValue());

        Trader trader = new Trader("Clem", account);
        trader.addTrade(trade);
        System.out.printf("updated value in account after trade added: %f", trader.getAccount().getValue());

    }
}

