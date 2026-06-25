package example.demo.controller;

import example.demo.model.Incident;
import example.demo.service.IncidentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
@CrossOrigin(origins = "*")
public class IncidentController {

    private final IncidentService service;

    public IncidentController(IncidentService service) {
        this.service = service;
    }

    /* CREATE INCIDENT */

    @PostMapping
    public Incident createIncident(@RequestBody Incident incident) {

        incident.setStatus("REPORTED");

        return service.saveIncident(incident);
    }

    /* GET ALL INCIDENTS */

    @GetMapping
    public List<Incident> getAll() {

        return service.getAllIncidents();
    }
}