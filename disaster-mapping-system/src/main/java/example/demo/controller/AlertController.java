package example.demo.controller;

import example.demo.model.Alert;
import example.demo.service.AlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
@CrossOrigin(origins = "*")
public class AlertController {

    private final AlertService service;

    public AlertController(AlertService service) {
        this.service = service;
    }

    @PostMapping
    public Alert createAlert(@RequestBody Alert alert) {

        return service.save(alert);
    }

    @GetMapping
    public List<Alert> getAllAlerts() {

        return service.getAll();
    }
}