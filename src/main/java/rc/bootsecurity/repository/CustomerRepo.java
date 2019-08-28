package rc.bootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.bootsecurity.model.customer;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<customer, Long> {
    @Override
    List<customer> findAll();

    @Override
    Optional<customer> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}

