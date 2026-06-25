package example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.demo.model.Incident;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {

}