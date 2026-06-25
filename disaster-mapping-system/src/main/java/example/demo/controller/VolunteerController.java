package example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import example.demo.model.Volunteer;
import example.demo.service.VolunteerService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerService service;

    @PostMapping
    public Volunteer saveVolunteer(@RequestBody Volunteer volunteer) {

        /* DEFAULT STATUS */

        if(volunteer.getAvailability() == null ||
           volunteer.getAvailability().isEmpty()){

            volunteer.setAvailability("Available");
        }

        return service.saveVolunteer(volunteer);
    }

    @GetMapping
    public List<Volunteer> getAllVolunteers() {

        return service.getAllVolunteers();
    }
}