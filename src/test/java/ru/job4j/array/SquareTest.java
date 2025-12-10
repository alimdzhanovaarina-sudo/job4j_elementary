package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4,};
        assertThat(result).containsExactly(expected);
    }
    @Test
    void whenBound2Then013() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 2, 3};
        assertThat(result).containsExactly(expected);
    }
}