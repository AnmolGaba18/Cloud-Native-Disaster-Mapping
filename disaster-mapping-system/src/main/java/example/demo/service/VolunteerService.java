package example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.demo.model.Volunteer;
import example.demo.repository.VolunteerRepository;

@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository repository;

    public Volunteer saveVolunteer(Volunteer volunteer) {
        return repository.save(volunteer);
    }

    public List<Volunteer> getAllVolunteers() {
        return repository.findAll();
    }
}