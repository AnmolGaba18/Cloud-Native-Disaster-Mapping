package example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.demo.model.Incident;
import example.demo.repository.IncidentRepository;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository repository;

    /* SAVE INCIDENT */

    public Incident saveIncident(Incident incident) {

        return repository.save(incident);
    }

    /* GET ALL INCIDENTS */

    public List<Incident> getAllIncidents() {

        return repository.findAll();
    }
}