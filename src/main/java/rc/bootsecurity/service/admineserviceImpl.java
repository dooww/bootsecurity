package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.bootsecurity.db.UserRepository;
import rc.bootsecurity.model.Equipment;
import rc.bootsecurity.model.User;
import rc.bootsecurity.repository.PostRepository;
import rc.bootsecurity.repository.projectRepository;

import java.util.List;

@Service("admin_sevice")
public class admineserviceImpl implements adminService {
    @Override
    public void creat_event() {

    }
    @Autowired
    private PostRepository postrepo;
    @Autowired
    private projectRepository projectrepo ;
    @Autowired
    private UserRepository userrepo;



    @Override
    public void create_formation() {

    }

    @Override
    public List<User> see_users() { return userrepo.findAll();

    }

    @Override
    public void delete_post(Long id) {postrepo.deleteById(id);


    }

    @Override
    public void delete_user(Long id) {

    }

    @Override
    public void project_details(String name) {

    }

    @Override
    public void find_user(String name) {

    }

    @Override
    public void change_role(String user_email) {

    }

    @Override
    public void add_equipmet(Equipment var) {

    }

    @Override
    public void delete_equipmet(Equipment var) {

    }


}
