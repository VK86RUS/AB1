package ru.netology;

import org.junit.Assert;
import org.junit.Test;

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
    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int result = service.remain(amount);

        Assert.assertEquals(result, 0);
    }
}