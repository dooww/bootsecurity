package rc.bootsecurity.service;


import rc.bootsecurity.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostSevice {
   public List<Post>findall();
   public List<Post>findbyname();
   public  void deletepost(Long id);
   public Optional<Post> findById(Long id);

    Post findbyname(String name);

    void save(Post var);
}
