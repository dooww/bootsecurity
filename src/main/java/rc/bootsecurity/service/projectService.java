package rc.bootsecurity.service;

import rc.bootsecurity.model.Project;

import java.util.List;
import java.util.Optional;

public interface projectService {
    public List<Project> findAll();
    public Optional<Project> findById(Long id);
    public void saveproject(Project project);
    public  List<Project> findByName(String name);
    public  void delete(Long id);
    public Project findbyname(String name);
}
