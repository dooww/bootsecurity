package rc.bootsecurity.service;


import rc.bootsecurity.model.event;

import java.util.List;
import java.util.Optional;


public interface eventService {
    public List<event>findall();
    public Optional<event> findbyid(Long id);
    public void saveevent(event var);
    public void deleteevent(Long id);
    public event findbyusername(String name);
}
