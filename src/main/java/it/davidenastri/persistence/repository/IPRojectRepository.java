package it.davidenastri.persistence.repository;

import it.davidenastri.persistence.model.Project;

import java.util.Optional;

public interface IPRojectRepository {

    Optional<Project> findById(Long id);
    Project save(Project project);

}
