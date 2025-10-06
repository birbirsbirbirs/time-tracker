package co.ptm.timetracker.api.controller;

import co.ptm.timetracker.api.model.bingo.BingRow;
import co.ptm.timetracker.api.service.bingo.BingNumberGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bingo-generator")
public class BingeGeneratorController {
    private final BingNumberGenerator bingNumberGenerator;

    @GetMapping
    public List<BingRow> getBingoCard(){
        return bingNumberGenerator.generateRandomNumbers();
    }

}
