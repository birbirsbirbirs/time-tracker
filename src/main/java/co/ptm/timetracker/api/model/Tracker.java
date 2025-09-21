package co.ptm.timetracker.api.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tracker {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(updatable = false, nullable = false)
    private UUID id;

    private String action;
    private Instant startTime;
    private Instant stopTime;
    @Nullable
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "tracker_user_id")
    private TrackerUser trackerUser;
}
