package service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.Experience.Experience;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin
@RestController
@RequestMapping("/experience")
public class ExperienceController {

    private static final String template = "A long, long time ago, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/experiences", method = GET)
    @ResponseBody
    public ResponseEntity<List<Experience>> experiences(@RequestParam(value = "name", defaultValue = "World") String name) {
        Experience experience = new Experience(Date.from(Instant.now()), String.format(template, name));
        List<Experience> experiences = new ArrayList<>(Collections.singletonList(experience));
        return ResponseEntity.ok(experiences);
    }


}
