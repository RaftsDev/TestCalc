package com.company.test;
import static org.junit.jupiter.api.Assertions.*;
import com.company.app.Calculator;
import org.junit.jupiter.api.*;

class calculatorTestAdd {

    int count =0;
    @BeforeAll
    static void setup() {
        System.out.println("********* Start test of Add operation ***********");
        //var calc = new Calculator();

    }

    @BeforeEach
    void init() {
        count++;
        System.out.println("Test N"+count);
        //var calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - executed after all test methods.");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("All numbers positive")
    void add() {
        var calc = new Calculator();
        assertEquals(5, calc.add(3,2));
    }

    @org.junit.jupiter.api.Test
    void addNegative() {
        var calc = new Calculator();
        assertEquals(1, calc.add(3,-2));
    }

    @org.junit.jupiter.api.Test
    @Disabled("Not implemented yet")
    void addAllNegative() {
        var calc = new Calculator();
        assertEquals(-5, calc.add(-3,-2));
    }

    @Test
    void groupAssertions() {
        var calc = new Calculator();
        assertAll("TestsWithZerro",
                () -> assertEquals(calc.add(0,0), 0),
                () -> assertEquals(calc.add(0,1), 1),
                () -> assertEquals(calc.add(1,0), 1)
        );
    }


}