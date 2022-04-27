package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCountRemainsBeforeMax() {
        int amount = 999;
        assertEquals(service.remain(amount), 1);
    }

    @Test
    public void shouldCountRemainsAfterMin() {
        int amount = 1;
        assertEquals(service.remain(amount), 999);
    }

    @Test
    public void shouldCountRemainsWithoutPurchase() {
        int amount = 0;
        assertEquals(service.remain(amount), 1000);
    }

    @Test
    public void shouldCountRemains() {
        int amount = 200;
        assertEquals(service.remain(amount), 800);
    }

    @Test
    public void shouldCountRemainsWithError() {
        int amount = 1000;
        assertEquals(service.remain(amount), 0);
    }
}