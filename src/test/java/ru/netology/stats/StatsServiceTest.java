package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

@Test
    public void shouldSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17};

        long actual = service.sum(sales);
        long expected = 68;

    Assertions.assertEquals(expected,actual);

}

    @Test
    public void FindMinmounth() {
        StatsService service = new StatsService();

        int[] sales = {16000, 5000, 6500, 12500, 13000, 4000, 17000, 2000, 11000, 10000, 12000, 9500};

        long actual = service.minSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void FindMaxmounth() {
        StatsService service = new StatsService();

        int[] sales = {16000, 5000, 6500, 12500, 13000, 4000, 17000, 2000, 11000, 10000, 12000, 9500};

        long actual = service.maxSales(sales);
        long expected = 7;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void AverSales() {
        StatsService service = new StatsService();

        int[] sales = {16000, 5500, 6500, 12500, 13000, 4000, 17000, 2000, 11000, 10000, 12000, 9500};

        long actual = service.averSales(sales);
        long expected = 9916;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void CountMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {16000, 5500, 6500, 12500, 13000, 4000, 17000, 2000, 11000, 10000, 12000, 9500};

        long actual = service.CountMinMonth(sales);
        long expected = 5;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void CountMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {16000, 5500, 6500, 12500, 13000, 4000, 17000, 2000, 11000, 10000, 12000, 9500};

        long actual = service.CountMaxMonth(sales);
        long expected = 7;

        Assertions.assertEquals(expected,actual);

    }
}
