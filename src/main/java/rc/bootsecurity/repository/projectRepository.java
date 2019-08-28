package rc.bootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.bootsecurity.model.Project;

import java.util.List;
import java.util.Optional;

@Repository
public interface projectRepository extends JpaRepository<Project,Long> {
    @Override
    List<Project> findAll();

    @Override
    Optional<Project> findById(Long aLong);

    Project findByName(String name);
    @Override
    void deleteById(Long id);
}




