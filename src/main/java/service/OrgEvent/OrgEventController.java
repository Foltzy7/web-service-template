package service.OrgEvent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.Experience.Experience;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orgEvents")
public class OrgEventController {


    @GetMapping(value = "/all")
    @ResponseBody
    public ResponseEntity<List<OrgEvent>> getOrgEvents() {
        OrgEvent orgEvent = new OrgEvent(
                "Upcoming event name",
                "way down yonder on the chattahoochee",
                "It was hotter than a hoochy coochy. We laid rubber on the Georgia asphalt\n" +
                        "We got a little crazy but we never got caught");
        OrgEvent orgEvent2 = new OrgEvent(
                "Another event that is awesome",
                "Somewhere up north",
                "Bring your tennis racquet. Those mosquitos are big. ");
        OrgEvent orgEvent3 = new OrgEvent(
                "Don't miss this",
                "City park",
                "Meat tornadoes, sweet BBQ, iced cold tea...'Nuff said right? ");
        List<OrgEvent> orgEvents = new ArrayList<>();
        orgEvents.add(orgEvent);
        orgEvents.add(orgEvent2);
        orgEvents.add(orgEvent3);
        return ResponseEntity.ok(orgEvents);
    }


}
