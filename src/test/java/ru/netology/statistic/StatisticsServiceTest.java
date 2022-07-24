package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void allIncomesAreEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void currentMaxLessThenIncome() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 4, 5, 10, 15, 40, 66, 79, 255, 400};
        long expected = 400;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}