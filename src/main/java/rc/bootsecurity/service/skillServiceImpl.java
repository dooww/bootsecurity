package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.skill;
import rc.bootsecurity.repository.skillRepository;

import java.util.List;
import java.util.Optional;

@Service("project_service")

public class skillServiceImpl implements SkillService {
    @Autowired
    private skillRepository skillrepository;
    @Override
    public List<skill> findAllskill() {
        return skillrepository.findAll();
    }

    @Override
    public Optional<skill> findskillById(int id) {
        return skillrepository.findById((long)id);
    }

    @Override
    public List<skill> saveskill(skill user) {

        return null;
    }


    }
