package co.ptm.timetracker;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestTime {
    @Test
    void tes1(){
        System.out.println(ZonedDateTime.now().getZone());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = localDateTime.atZone(ZoneId.of("America/Chicago")).toInstant();
        System.out.println(instant);
    }
}
