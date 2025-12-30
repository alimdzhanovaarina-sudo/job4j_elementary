package ru.job4j.ru.job4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonoTest {

    @Test
    public void testIsMono() {
        assertTrue(Mono.isMono(new int[]{1, 2, 3}));
        assertTrue(Mono.isMono(new int[]{3, 2, 1}));
        assertTrue(Mono.isMono(new int[]{1, 3, 2}));
    }

    @Test
    public void testIsAsc() {
        assertTrue(Mono.isAsc(new int[]{1, 2, 3}));
        assertFalse(Mono.isAsc(new int[]{3, 2, 1}));
        assertFalse(Mono.isAsc(new int[]{1, 3, 2}));
    }
}

