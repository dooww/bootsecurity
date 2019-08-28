package rc.bootsecurity.service;

import rc.bootsecurity.model.skill;

import java.util.List;
import java.util.Optional;

public interface SkillService {
    public List<skill> findAllskill();
    public Optional<skill> findskillById(int id);
    public List<skill> saveskill(skill user);
}
