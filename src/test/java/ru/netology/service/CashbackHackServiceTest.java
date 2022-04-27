package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCountRemainsBeforeMax() {
        int amount = 999;
        assertEquals(1, service.remain(amount));
    }

    @Test
    public void shouldCountRemainsAfterMin() {
        int amount = 1;
        assertEquals(999, service.remain(amount));
    }

    @Test
    public void shouldCountRemainsWithoutPurchase() {
        int amount = 0;
        assertEquals(1000, service.remain(amount));
    }

    @Test
    public void shouldCountRemains() {
        int amount = 200;
        assertEquals(800, service.remain(amount));
    }

    @Test
    public void shouldCountRemainsWithError() {
        int amount = 1000;
        assertEquals(0, service.remain(amount));
    }
}