package it.davidenastri.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import it.davidenastri.persistence.model.Project;
import it.davidenastri.persistence.repository.IPRojectRepository;
import it.davidenastri.service.IProjectService;

public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IPRojectRepository projectRepo;

    @Override
    public Optional<Project> findById(Long id){
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project){
        return projectRepo.save(project);
    }

}