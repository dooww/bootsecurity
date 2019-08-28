package rc.bootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.bootsecurity.model.skill;

import java.util.List;
import java.util.Optional;

@Repository("SkillRepository")
public interface skillRepository extends JpaRepository<skill, Long> {
    @Override
    List<skill> findAll();

    @Override
    Optional<skill> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}