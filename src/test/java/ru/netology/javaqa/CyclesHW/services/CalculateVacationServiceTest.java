package ru.netology.javaqa.CyclesHW.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateVacationServiceTest {

    @Test
    public void сalculateFirstExample() {
        CalculateVacationService service = new CalculateVacationService();

        int expected = 3;
        int actual = service.calculateMonthOfVacation(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void сalculateSecondExample() {
        CalculateVacationService service = new CalculateVacationService();

        int expected = 2;
        int actual = service.calculateMonthOfVacation(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }
}