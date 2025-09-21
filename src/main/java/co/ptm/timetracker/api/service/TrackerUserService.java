package co.ptm.timetracker.api.service;

import co.ptm.timetracker.api.model.TrackerUser;
import co.ptm.timetracker.api.repository.TrackerUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class TrackerUserService {

    private final TrackerUserRepository trackerUserRepository;

    public TrackerUser saveTrackerUser(TrackerUser trackerUser){
        TrackerUser savedTrackerUser = trackerUserRepository.save(trackerUser);
        log.debug("saved: {}",savedTrackerUser);
        return savedTrackerUser;
    }

    public TrackerUser getUserByEmail(String email){
        TrackerUser trackerUserByEmail = trackerUserRepository.findByEmail(email);
        log.debug("trackerUser: {}, by email: {}",trackerUserByEmail,email);
        return trackerUserByEmail;
    }

    public List<TrackerUser> getAllUser(){
        List<TrackerUser> all = trackerUserRepository.findAll();
        all.forEach(u->log.debug("{}",u));
        return all;
    }

}
