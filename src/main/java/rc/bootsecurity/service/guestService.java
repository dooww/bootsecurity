package rc.bootsecurity.service;


import rc.bootsecurity.model.guest;

import java.util.List;

public interface guestService {


    public List<guest> findall();
    public  guest findbyid(Long id);
    public void saveguest(guest var);
    public void deleteguest(Long id);
    public void projectcheck();


}
