package co.ptm.timetracker.ui;

import co.ptm.timetracker.api.model.TracerRequest;
import co.ptm.timetracker.api.model.TrackerUser;
import co.ptm.timetracker.api.service.TrackerTrackService;
import co.ptm.timetracker.api.service.TrackerUserService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.util.List;

@Slf4j
@Route("")
public class MainView extends VerticalLayout {
    private final TrackerUserService trackerUserService;
    private final TrackerTrackService trackerTrackService;
    private List<String> emailList;
    private TracerRequest tracerRequest;
    public MainView(TrackerUserService trackerUserService,TrackerTrackService trackerTrackService){
        this.trackerUserService=trackerUserService;
        this.trackerTrackService=trackerTrackService;
        emailList=trackerUserService.getAllUser().stream().map(TrackerUser::getEmail).toList();

        H1 header = new H1("ptm tracker");

        Select<String> selectEmail=new Select<>();
        selectEmail.setLabel("user by email.");
        selectEmail.setItems(this.emailList);

        DateTimePicker dateTimePickerStart=new DateTimePicker("startTime");
        DateTimePicker dateTimePickerStop=new DateTimePicker("stopTime");

        TextField textFieldAction=new TextField("action");
        TextField textFieldRemarks=new TextField("remarks");

        Button addTacker=new Button("add tracker");
        addTacker.addClickListener(e->{
            TracerRequest tracerRequest = TracerRequest.builder()
                    .startTime(dateTimePickerStart.getValue())
                    .stopTime(dateTimePickerStop.getValue())
                    .zoneId(ZoneId.of("America/Chicago"))
                    .email(selectEmail.getValue())
                    .action(textFieldAction.getValue())
                    .remarks(textFieldRemarks.getValue())
                    .build();

            trackerTrackService.save(tracerRequest);

            textFieldAction.clear();
            textFieldRemarks.clear();
        });

        add(header,selectEmail,dateTimePickerStart,dateTimePickerStop,textFieldAction,textFieldRemarks,addTacker);
    }



}
