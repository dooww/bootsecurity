package rc.bootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.bootsecurity.model.event;

import java.util.List;
import java.util.Optional;

@Repository("EventRepo")
public interface EventRepo extends JpaRepository<event, Long> {

    event findByUsername(String username);
    @Override
    List<event> findAll();

    @Override
    Optional<event> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
