package rc.bootsecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.model.User;
import rc.bootsecurity.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController



public class UsersController {

	@Autowired
	private UserService userService;

	@RequestMapping(value ="/users" , method = RequestMethod.GET)
	public List<User> users() {
		List<User> users = userService.findAllUsers();

		return users;
	}
	@Secured({"Role_Admin","Role_Guest"})

	@RequestMapping(value ="/userbyid/{id}" , method = RequestMethod.GET)
	public Optional<User> user(@PathVariable int id) {
		Optional<User> user = userService.findUserById(id);

		return user;
	}


	@Secured({"Role_Admin","Role_Guest"})
	@RequestMapping(value ="/userbyemail/{email}" , method = RequestMethod.GET)
	public User userbuemail(@PathVariable String email) {
		User user = userService.findUserByEmail(email);

		return user;
	}
	@Secured({"Role_Admin","Role_Guest"})
	@RequestMapping(value ="/userbyname/{name}" , method = RequestMethod.GET)
	public Optional<User> userbyname(@PathVariable String name) {
		Optional<User> user = Optional.ofNullable(userService.findUserbyusername(name));

		return user;
	}



	@Secured({"Role_Admin"})

	@RequestMapping(value ="/sign_in"  , method = RequestMethod.POST)
	public  void adduser(@RequestBody User user){
		userService.saveUser(user);
	}


}
