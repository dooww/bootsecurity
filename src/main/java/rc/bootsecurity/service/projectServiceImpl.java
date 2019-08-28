package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.Project;

import java.util.List;
import java.util.Optional;

@Service("projectService")
public class projectServiceImpl implements projectService  {
    @Autowired
    private rc.bootsecurity.repository.projectRepository projectRepository;

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public void saveproject(Project project) {
        projectRepository.save(project);

    }
    @Override
    public  List<Project> findByName(String name ){//wwwwwwwwwrite some thing in here
        return null;
    };



    @Override
    public  void  delete(Long id ){

            Optional<Project> project= projectRepository.findById(id);
        projectRepository.deleteById(id);
    }

    @Override
    public Project findbyname(String username) {

        return projectRepository.findByName(username);
    }

}
