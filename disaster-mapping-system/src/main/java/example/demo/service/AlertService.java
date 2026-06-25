package example.demo.service;

import example.demo.model.Alert;
import example.demo.repository.AlertRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {

    private final AlertRepository repository;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
    }

    public Alert save(Alert alert) {
        return repository.save(alert);
    }

    public List<Alert> getAll() {
        return repository.findAll();
    }
}