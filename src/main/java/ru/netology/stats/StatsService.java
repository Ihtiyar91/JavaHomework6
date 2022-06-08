package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSalesAmount(long[] sales) {
        long sum = salesAmount(sales);
        long averageSum = sum / sales.length;
        return averageSum;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
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

    public long numberMonthMinSales(long[] sales) {
        long averageSum = averageSalesAmount(sales);
        int z = 0;
        for (int a = 0; a < sales.length; a++) {
            if (averageSum < sales[a])
                z = z + 1;
        }
        return z;
    }

    public long numberMonthMaxSales(long[] sales) {
        long averageSum = averageSalesAmount(sales);
        int z = 0;
        for (int a = 0; a < sales.length; a++) {
            if (averageSum < sales[a])
                z = z + 1;
        }
        return z;
    }
}