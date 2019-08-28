package rc.bootsecurity.service;

import rc.bootsecurity.model.customer;

import java.util.List;


public interface CustomerService {


    public List<customer> findAllabonne();
    public customer findabonneById(Long id);
    public customer findabonneByEmail(String email);
    public customer findabonnebyname(String name);
    public void saveabonne(customer customer);
    public void getequipment();
    public void rate_equipment();
    public void applyfor_event()
;}
