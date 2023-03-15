package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    ru.netology.service.CashbackHackService service =  new ru.netology.service.CashbackHackService();
    @Test
    void CashbackHackServiceTestOne() {
        assertEquals(service.remain(3600), 400);

    }

    @Test
    public void CashbackHackServiceTestTwo() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void CashbackHackServiceTestThree() {
        assertEquals(service.remain(1000), 0);
    }

}