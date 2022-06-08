import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void shouldSalesAmount() {
        StatsService service = new StatsService();
        long expectedSum = 180;
        long actualSum = service.salesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSalesAmount() {
        StatsService service = new StatsService();
        long expectedSum = 15;
        long actualSum = service.averageSalesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldMonthMinSales() {
        StatsService service = new StatsService();
        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldNumberMonthMinSales() {
        StatsService service = new StatsService();
        long expectedMonth = 5;
        long actualMonth = service.numberMonthMinSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldNumberMonthMaxSales() {
        StatsService service = new StatsService();
        long expectedMonth = 5;
        long actualMonth = service.numberMonthMaxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}