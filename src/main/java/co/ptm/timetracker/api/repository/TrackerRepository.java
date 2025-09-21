package co.ptm.timetracker.api.repository;

import co.ptm.timetracker.api.model.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrackerRepository extends JpaRepository<Tracker, UUID> {
}
