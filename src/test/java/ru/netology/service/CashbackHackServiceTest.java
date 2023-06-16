package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    // Сумма выше max
    public void amountIsOverBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    // Сумма равна max
    public void amountIsEqualBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    // сумма меньше минимума
    public void amountIsLowerBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 300;

        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}