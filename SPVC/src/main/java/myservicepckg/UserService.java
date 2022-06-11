package myservicepckg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mydaopckg.UserDao;
import mypckg1.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user)
	{
		return this.userDao.saveUser(user);
	}

}
