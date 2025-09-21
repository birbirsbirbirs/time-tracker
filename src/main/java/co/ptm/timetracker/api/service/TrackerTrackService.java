package co.ptm.timetracker.api.service;

import co.ptm.timetracker.api.model.TracerRequest;
import co.ptm.timetracker.api.model.Tracker;
import co.ptm.timetracker.api.model.TrackerUser;
import co.ptm.timetracker.api.repository.TrackerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class TrackerTrackService {
    private final TrackerUserService trackerUserService;
    private final TrackerRepository trackerRepository;

    public Tracker save(TracerRequest tracerRequest) {
        TrackerUser trackerUser = trackerUserService.getUserByEmail(tracerRequest.getEmail());
        Tracker tracker = Tracker.builder().trackerUser(trackerUser)
                .startTime(getInstant(tracerRequest.getStartTime(),tracerRequest.getZoneId()))
                .stopTime(getInstant(tracerRequest.getStopTime(),tracerRequest.getZoneId()))
                .action(tracerRequest.getAction())
                .remarks(tracerRequest.getRemarks())
                .build();
        Tracker savedTracker = trackerRepository.save(tracker);
        log.debug("tracker saved: {}",savedTracker);
        return savedTracker;
    }

    private Instant getInstant(LocalDateTime localDateTime,ZoneId zoneId) {
        return localDateTime.atZone(zoneId).toInstant();
    }

    public List<Tracker> findAllTracker() {
        return trackerRepository.findAll();
    }
}
