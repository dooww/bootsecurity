package rc.bootsecurity.service;

import org.springframework.stereotype.Service;
import rc.bootsecurity.model.guest;

import java.util.List;

@Service("guest_sevice")

public class guestServiceImpl implements guestService {
    @Override
    public List<guest> findall() {
        return null;
    }

    @Override
    public guest findbyid(Long id) {
        return null;
    }

    @Override
    public void saveguest(guest var) {

    }

    @Override
    public void deleteguest(Long id) {

    }

    @Override
    public void projectcheck() {

    }
}
