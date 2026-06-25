package example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.demo.model.Resource;
import example.demo.repository.ResourceRepository;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository repository;

    public Resource saveResource(Resource resource) {
        return repository.save(resource);
    }

    public List<Resource> getAllResources() {
        return repository.findAll();
    }
}