package co.ptm.timetracker.api.util.bingo;

import org.junit.jupiter.api.Test;

import java.util.Set;

class TestRandomColumnGenerator {

    @Test
    void generateRandomNumbers1To16() {
        Set<Integer> integers = co.ptm.timetracker.api.util.bingo.RandomColumnGenerator.generateRandomNumbers(1,16);
        System.out.println(integers);
    }

    @Test
    void generateRandomNumbers16To31() {
        Set<Integer> integers = co.ptm.timetracker.api.util.bingo.RandomColumnGenerator.generateRandomNumbers(16, 31);
        System.out.println(integers);
    }

    @Test
    void clegenerateRandomNumbers31To46() {
        Set<Integer> integers = co.ptm.timetracker.api.util.bingo.RandomColumnGenerator.generateRandomNumbers(31, 46);
        System.out.println(integers);
    }

    @Test
    void generateRandomNumbers46To61() {
        Set<Integer> integers = co.ptm.timetracker.api.util.bingo.RandomColumnGenerator.generateRandomNumbers(46, 61);
        System.out.println(integers);
    }

    @Test
    void generateRandomNumbers61To76() {
        Set<Integer> integers = co.ptm.timetracker.api.util.bingo.RandomColumnGenerator.generateRandomNumbers(61, 76);
        System.out.println(integers);
    }
}