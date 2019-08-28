package rc.bootsecurity.repository;


import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.bootsecurity.model.Post;

import java.util.List;
import java.util.Optional;

@Repository

public interface PostRepository extends JpaRepository<Post,Long> {

    @Override
    List<Post> findAll();
    
    

    @Override
    Optional<Post> findById(Long aLong);

    @Override
    <S extends Post> Optional<S> findOne(Example<S> example);

    @Override
    void deleteById(Long id);

    Post findByname(String name);
}