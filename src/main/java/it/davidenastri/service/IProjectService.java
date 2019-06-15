package it.davidenastri.service;

import it.davidenastri.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(Long id);
    Project save(Project project);
    
}
