package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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