package ru.netology.stats;

public class StatsService {

    public long sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long averSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        int length = sales.length;
        return sum / length;
    }

    public long CountMinMonth(int[] sales) {
        int countMonth = 0;
        long averSale = averSales(sales);
        for (long sale : sales) {
            if (sale < averSale) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public long CountMaxMonth(int[] sales) {
        int countMonth = 0;
        long averSale = averSales(sales);
        for (long sale : sales) {
            if (sale > averSale) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
