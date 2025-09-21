package co.ptm.timetracker.api.repository;

import co.ptm.timetracker.api.model.TrackerUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrackerUserRepository extends JpaRepository<TrackerUser, UUID> {
    TrackerUser findByEmail(String email);
}
