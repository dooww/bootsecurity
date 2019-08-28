package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.Equipment;
import rc.bootsecurity.repository.EquipmentRepo;

import java.util.List;
import java.util.Optional;

@Service("equipment_service")
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    EquipmentRepo equipmentRepo;
    @Override
    public List<Equipment> findall() {
        return equipmentRepo.findAll();
    }

    @Override
    public Optional<Equipment> findbyid(Long id) {
        return equipmentRepo.findById(id);
    }

    @Override
    public void saveequipment(Equipment var) {
        equipmentRepo.save(var);

    }

    @Override
    public void deleteequipment(Long id) {
        equipmentRepo.deleteById(id);

    }


    @Override
    public Optional<Equipment> findbyusername(String username) {
        equipmentRepo.findByUsername(username);

        return null;
    }

    @Override
    public void updateequipment(Equipment var) {
        equipmentRepo.deleteById(var.getId());
        equipmentRepo.save(var);

    }
}
