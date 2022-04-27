package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldCountRemainsBeforeMax() {
        int amount = 999;
        assertEquals(1,service.remain(amount));
    }

    @Test
    void shouldCountRemainsAfterMin() {
        int amount = 1;
        assertEquals(999,service.remain(amount));
    }

    @Test
    void shouldCountRemainsWithoutPurchase() {
        int amount = 0;
        assertEquals(1000,service.remain(amount));
    }

    @Test
    void shouldCountRemains() {
        int amount = 200;
        assertEquals(800,service.remain(amount));
    }

    @Test
    void shouldCountRemainsWithError() {
        int amount = 1000;
        assertEquals(0,service.remain(amount));
    }
}