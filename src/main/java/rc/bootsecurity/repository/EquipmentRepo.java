package rc.bootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.bootsecurity.model.Equipment;
import rc.bootsecurity.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface EquipmentRepo extends JpaRepository<Equipment, Long> {


    Equipment findByUsername(String username);
    @Override
    List<Equipment> findAll();

    @Override
    Optional<Equipment> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
