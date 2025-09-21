package co.ptm.timetracker.api.model;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TracerRequest{
    private ZoneId zoneId;
    private String action;
    private LocalDateTime startTime;
    private LocalDateTime stopTime;
    @Nullable
    private String remarks;
    private String email;
}
