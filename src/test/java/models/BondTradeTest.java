package models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {

    @Test
    void setDividend_WhenDividendNegative_ShouldThrowIllegalArgException() {
        assertThatThrownBy(() -> new BondTrade("1", "APPL", 100, -50))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("dividend cannot be negative!");
    }
}