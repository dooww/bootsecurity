package rc.bootsecurity.service;


import rc.bootsecurity.model.Equipment;
import rc.bootsecurity.model.User;

import java.util.List;


public interface adminService {
    public void creat_event();
    public void create_formation();
    public List<User> see_users();
    public void delete_post(Long id);
    public void delete_user(Long id);
    public void project_details(String name);
    public void find_user(String name);
     public void change_role(String user_email);
     public void add_equipmet(Equipment var);
    public void delete_equipmet(Equipment var);
}
