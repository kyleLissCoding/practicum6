package edu.iu.p466.arithmetic_service.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddServiceTest {

    AddService addService = new AddService();

    @Test
    void add5_2() {
        int n = 5;
        int m = 2;
        int expected = 7;
        int actual = addService.add(n, m);
        assertEquals(expected, actual);
    }
}