package co.ptm.timetracker.api.util.bingo;

import lombok.experimental.UtilityClass;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class RandomColumnGenerator {

    public Set<Integer> generateRandomNumbers(int min, int max){
        Set<Integer> result = new HashSet<>();
        while (result.size() <5){
            result.add(ThreadLocalRandom.current().nextInt(min, max));
        }
        return result;
    }

}
