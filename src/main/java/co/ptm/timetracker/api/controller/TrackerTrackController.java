package co.ptm.timetracker.api.controller;

import co.ptm.timetracker.api.model.TracerRequest;
import co.ptm.timetracker.api.model.Tracker;
import co.ptm.timetracker.api.service.TrackerTrackService;
import co.ptm.timetracker.api.service.TrackerUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/tracker-track")
public class TrackerTrackController {

    private final TrackerUserService trackerUserService;
    private final TrackerTrackService trackerTrackService;


    @PostMapping()
    public Tracker saveTracker(@RequestBody TracerRequest tracerRequest){
        return trackerTrackService.save(tracerRequest);
    }

    @GetMapping
    public List<Tracker> getAllTracker(){
        return trackerTrackService.findAllTracker();
    }

}
