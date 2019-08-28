package rc.bootsecurity.service;

import rc.bootsecurity.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
	public List<User> findAllUsers();
	public Optional<User> findUserById(int id);
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public User findUserbyusername(String username);
}
