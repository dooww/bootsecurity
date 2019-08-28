package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.Post;
import rc.bootsecurity.repository.PostRepository;

import java.util.List;
import java.util.Optional;

@Service("post_sevice")

public class postserviceImpl implements PostSevice {
    @Autowired
    private PostRepository postrepo;
    @Override
    public List<Post> findall(){
        return postrepo.findAll();
    }
    @Override
    public List<Post> findbyname(){return null;}




    @Override
    public  void deletepost(Long id ){ postrepo.deleteById(id);}

    @Override
    public Optional<Post> findById(Long id) {
        return  postrepo.findById(id);
    }

    @Override
    public Post findbyname(String name) {
       return postrepo.findByname(name)  ;  }

    @Override
    public void save(Post var) {postrepo.save(var);

    }

}
