/*
package models;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class TraderTest {

    @ParameterizedTest
    @CsvSource(
            {
                    "0.0, 0, 0.0, 0.0",
                    "1.0, 2, 3.0, 7.0",
                    "0.0, 5, 4.0, 20.0",
                    "-1.0, 3, 2.0, 5.0",
                    "10.0, 0, 4.0, 10.0",
                    "2.5, 4, 1.0, 6.5",
                    "-3.5, 2, 2.5, 1.5"
            }
                )
    void addTrade_ShouldUpdateAccountValueFieldCorrectly(
            double InitValue,
            int quantity,
            double price,
            double expected
                                                              ) {
        Trader trader = new Trader("Sam", new Account(InitValue));
        Trade trade = new Trade("1", "GOOGLE", quantity, price);

        trader.addTrade(trade);

        assertThat(trader.getAccount().getValue())
                .as("check account InitValue=%f,  quantity=%d, price=%f values",
                        InitValue, quantity, price)
                .isCloseTo(expected, within(0.001));

    }
}

 */