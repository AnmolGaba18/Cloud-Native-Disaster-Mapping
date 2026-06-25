package example.demo.controller;

import example.demo.model.Resource;
import example.demo.service.ResourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/resources")
public class ResourceController {

    @Autowired
    private ResourceService service;

    @PostMapping
    public Resource saveResource(@RequestBody Resource resource) {

        resource.setStatus("available");

        return service.saveResource(resource);
    }

    @GetMapping
    public List<Resource> getAllResources() {

        return service.getAllResources();
    }
}