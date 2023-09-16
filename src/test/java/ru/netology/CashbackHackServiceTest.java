package ru.netology;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
}