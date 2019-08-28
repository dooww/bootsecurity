package rc.bootsecurity.service;


import org.springframework.stereotype.Service;
import rc.bootsecurity.model.customer;

import java.util.List;

@Service("customer_sevice")

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<customer> findAllabonne() {
        return null;
    }

    @Override
    public customer findabonneById(Long id) {
        return null;
    }

    @Override
    public customer findabonneByEmail(String email) {
        return null;
    }

    @Override
    public customer findabonnebyname(String name) {
        return null;
    }

    @Override
    public void saveabonne(customer customer) {

    }

    @Override
    public void getequipment() {

    }

    @Override
    public void rate_equipment() {

    }

    @Override
    public void applyfor_event() {

    }
}
