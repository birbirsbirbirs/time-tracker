package co.ptm.timetracker.api.service.bingo;

import co.ptm.timetracker.api.model.bingo.BingRow;
import co.ptm.timetracker.api.util.bingo.RandomColumnGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class BingNumberGenerator {


public List<BingRow> generateRandomNumbers(){
    List<BingRow> bingoRowsList = new ArrayList<>();

    List<Integer> firstColumn = RandomColumnGenerator.generateRandomNumbers(1, 16).stream().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
    List<Integer> secondColumn = RandomColumnGenerator.generateRandomNumbers(16,31).stream().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
    List<Integer> thirdColumn = RandomColumnGenerator.generateRandomNumbers(31, 46).stream().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
    List<Integer> fourthColumn = RandomColumnGenerator.generateRandomNumbers(46, 61).stream().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
    List<Integer> fifthColumn = RandomColumnGenerator.generateRandomNumbers(61, 76).stream().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());

    int firstColumnInteger=0;
    BingRow bingRow0 = BingRow.builder()
            .number0(firstColumn.get(firstColumnInteger))
            .number1(secondColumn.get(firstColumnInteger))
            .number2(thirdColumn.get(firstColumnInteger).toString())
            .number3(fourthColumn.get(firstColumnInteger))
            .number4(fifthColumn.get(firstColumnInteger))
            .build();

    bingoRowsList.add(bingRow0);

    firstColumnInteger=1;

    BingRow bingRow1 = BingRow.builder()
            .number0(firstColumn.get(firstColumnInteger))
            .number1(secondColumn.get(firstColumnInteger))
            .number2(thirdColumn.get(firstColumnInteger).toString())
            .number3(fourthColumn.get(firstColumnInteger))
            .number4(fifthColumn.get(firstColumnInteger))
            .build();

    bingoRowsList.add(bingRow1);

    firstColumnInteger=2;

    BingRow bingRow2 = BingRow.builder()
            .number0(firstColumn.get(firstColumnInteger))
            .number1(secondColumn.get(firstColumnInteger))
            .number2("FREE")
            .number3(fourthColumn.get(firstColumnInteger))
            .number4(fifthColumn.get(firstColumnInteger))
            .build();

    bingoRowsList.add(bingRow2);

    firstColumnInteger=3;

    BingRow bingRow3 = BingRow.builder()
            .number0(firstColumn.get(firstColumnInteger))
            .number1(secondColumn.get(firstColumnInteger))
            .number2(thirdColumn.get(firstColumnInteger).toString())
            .number3(fourthColumn.get(firstColumnInteger))
            .number4(fifthColumn.get(firstColumnInteger))
            .build();

    bingoRowsList.add(bingRow3);

    firstColumnInteger=4;

    BingRow bingRow4 = BingRow.builder()
            .number0(firstColumn.get(firstColumnInteger))
            .number1(secondColumn.get(firstColumnInteger))
            .number2(thirdColumn.get(firstColumnInteger).toString())
            .number3(fourthColumn.get(firstColumnInteger))
            .number4(fifthColumn.get(firstColumnInteger))
            .build();

    bingoRowsList.add(bingRow4);

    firstColumnInteger=firstColumnInteger++;


    return bingoRowsList;
}

}
