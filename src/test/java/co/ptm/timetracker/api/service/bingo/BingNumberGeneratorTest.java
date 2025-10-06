package co.ptm.timetracker.api.service.bingo;

import co.ptm.timetracker.api.util.bingo.RandomColumnGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BingNumberGeneratorTest {

    @Test
    void generate() {
        List<Integer> firstColumn = RandomColumnGenerator.generateRandomNumbers(1, 16).stream().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
        firstColumn.forEach(column -> System.out.println(column));
    }

    @Test
    void generate2() {
        BingNumberGenerator bingNumberGenerator = new BingNumberGenerator();
        bingNumberGenerator.generateRandomNumbers();
    }

}