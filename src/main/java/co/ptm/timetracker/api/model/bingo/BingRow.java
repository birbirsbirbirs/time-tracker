package co.ptm.timetracker.api.model.bingo;

import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BingRow {
    @Nonnull
    private Integer number0;
    @Nonnull
    private Integer number1;
    @Nonnull
    private String number2;
    @Nonnull
    private Integer number3;
    @Nonnull
    private Integer number4;
}
