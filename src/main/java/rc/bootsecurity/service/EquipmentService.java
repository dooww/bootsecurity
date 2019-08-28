package rc.bootsecurity.service;


import rc.bootsecurity.model.Equipment;

import java.util.List;
import java.util.Optional;


public interface EquipmentService {

    public List<Equipment> findall();
    public Optional<Equipment> findbyid(Long id);
    public void saveequipment(Equipment var);
    public void deleteequipment(Long id);
    public void updateequipment(Equipment var);
    public Optional<Equipment> findbyusername(String username);
}
