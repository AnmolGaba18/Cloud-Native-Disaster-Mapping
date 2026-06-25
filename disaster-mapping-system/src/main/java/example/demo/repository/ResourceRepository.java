package example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.demo.model.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

}