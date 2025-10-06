package co.ptm.timetracker.ui;

import co.ptm.timetracker.api.model.bingo.BingRow;
import co.ptm.timetracker.api.service.bingo.BingNumberGenerator;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Route("/bingo-generator")
public class BingeGenerator extends VerticalLayout {
    private final BingNumberGenerator bingNumberGenerator;

    public BingeGenerator(BingNumberGenerator bingNumberGenerator) {
        this.bingNumberGenerator = bingNumberGenerator;
        String bingoHeader = "Happy Dashain 2025!!";
        H1 h1 = new H1(bingoHeader);

        Grid<BingRow> grid = new Grid<>(BingRow.class, false);
        grid.addColumn(BingRow::getNumber0).setHeader("B");
        grid.addColumn(BingRow::getNumber1).setHeader("I");
        grid.addColumn(BingRow::getNumber2).setHeader("N");
        grid.addColumn(BingRow::getNumber3).setHeader("G");
        grid.addColumn(BingRow::getNumber4).setHeader("O");
        List<BingRow> bingRowList = bingNumberGenerator.generateRandomNumbers();
        grid.setItems(bingRowList);
        grid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
        grid.addThemeVariants(GridVariant.LUMO_COMPACT);
        grid.addThemeVariants(GridVariant.LUMO_COLUMN_BORDERS);
        grid.setSizeFull();

        Grid<BingRow> grid1 = new Grid<>(BingRow.class, false);
        grid1.addColumn(BingRow::getNumber0).setHeader("B");
        grid1.addColumn(BingRow::getNumber1).setHeader("I");
        grid1.addColumn(BingRow::getNumber2).setHeader("N");
        grid1.addColumn(BingRow::getNumber3).setHeader("G");
        grid1.addColumn(BingRow::getNumber4).setHeader("O");
        List<BingRow> bingRowList1 = bingNumberGenerator.generateRandomNumbers();
        grid1.setItems(bingRowList1);


        add(h1,grid1);
    }
}
