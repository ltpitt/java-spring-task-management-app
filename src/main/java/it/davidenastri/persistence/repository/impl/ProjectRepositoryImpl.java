package it.davidenastri.persistence.repository.impl;

import it.davidenastri.persistence.model.Project;
import it.davidenastri.persistence.repository.IPRojectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements IPRojectRepository {

    List<Project> projects = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Project save(Project project) {

        Project existingProject = findById(project.getId()).orElse(null);
        if (existingProject == null){
            projects.add(project);
        } else {
            projects.remove(existingProject);
            projects.add(project);
        }
        return project;
    }

}
