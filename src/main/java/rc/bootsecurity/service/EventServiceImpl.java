package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.event;
import rc.bootsecurity.repository.EventRepo;

import java.util.List;
import java.util.Optional;

@Service("event_sevice")

public class EventServiceImpl implements eventService {


    @Autowired
    private EventRepo eventRepo;
    @Override
    public List<event> findall() {
        return  eventRepo.findAll();
    }

    @Override
    public Optional<event> findbyid(Long id) {
        return eventRepo.findById(id);
    }

    @Override
    public void saveevent(event var) {
        eventRepo.save(var);

    }

    @Override
    public void deleteevent(Long id) {
        eventRepo.deleteById(id);
    }

    @Override
    public event findbyusername(String name) {
        return eventRepo.findByUsername(name);

    }
}
