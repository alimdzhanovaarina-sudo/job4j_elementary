package ru.job4j.calculator;

import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input1 = 170;
        double expected1 = 69;
        double output1 = Fit.womanWeight(input1);
        assertThat(output1).isEqualTo(expected1, withPrecision(0.01));
    }
}