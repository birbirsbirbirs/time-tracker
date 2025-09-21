package co.ptm.timetracker.api.controller;

import co.ptm.timetracker.api.model.TrackerUser;
import co.ptm.timetracker.api.service.TrackerUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/tracker-user")
public class TrackerUserController {
    private final TrackerUserService trackerUserService;


    @PostMapping()
    public TrackerUser saveTrackerUser(@RequestBody TrackerUser trackerUser){
        return trackerUserService.saveTrackerUser(trackerUser);
    }

    @GetMapping
    public List<TrackerUser> getAllTrackerUser(){
        return trackerUserService.getAllUser();
    }

    @GetMapping("/by-email")
    public TrackerUser getTrackerUserByEmail(@RequestParam String email){
        return trackerUserService.getUserByEmail(email);
    }

}
