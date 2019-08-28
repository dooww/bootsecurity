package rc.bootsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import rc.bootsecurity.db.UserRepository;
import rc.bootsecurity.model.User;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public Optional<User> findUserById(int id) {
		return userRepository.findById((long) id);
	}
	
	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()) );
		user.setActive(1);
		//Role userRole = roleRepository.findByName("ADMIN");

		//user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);		
	}



	@Override
	public User findUserbyusername(String username) {

		return userRepository.findByUsername(username);
	}

}
