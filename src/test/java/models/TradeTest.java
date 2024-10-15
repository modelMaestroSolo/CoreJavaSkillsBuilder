/*
package models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TradeTest {

    @Test
    void testSetPrice_WhenPricePositive_ShouldSetPriceSuccessfully(){

        Trade trade = new Trade("1", "AAPL", 100);

        trade.setPrice(1.00);

        assertThat(trade.getPrice())
                .as("check if positive price is successfully set")
                .isEqualTo(1.00);
    }

    @Test
    void testSetPrice_WhenPriceNegative_ShouldThrowIllegalArgException() {
        Trade trade = new Trade("T1", "GOOGL", 101);

        assertThatThrownBy(() -> trade.setPrice(-12.0))
                .as("check if illegal arg exception is thrown")
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Prices can only be positive values.");

    }
}

 */