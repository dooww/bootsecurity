package rc.bootsecurity.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.User;
import rc.bootsecurity.repository.EventRepo;
import rc.bootsecurity.model.event;


import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private EventRepo eventRepo;
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.eventRepo =eventRepo ;
    }

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();

        // Crete users
        User dan = new User("dan",passwordEncoder.encode("dan123"),"USER","");
        User admin = new User("admin",passwordEncoder.encode("admin123"),"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("manager123"),"MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(dan,admin,manager);

        // Save to db
        this.userRepository.saveAll(users);
        event e1 = new event("https://fr.linkedin.com","hedi",111);
        event e2 = new event("https://fr.linkedin.com","",111);
        this.eventRepo.save(e1);
        this.eventRepo.save(e2);







    }
}
