package users.service;

import java.util.List;

import users.entity.Users;

public interface UsersService {
	public int deleteUser(int id);
	public int blackUser(int id);
	public int freezeUser(int id);
	public int fireUser(int id);
	public int setUservip(int id);
	public List<Users> selectUserById(int id);
	public List<Users> selectUserByTelnum(String Telnum);
	public List<Users> selectUserByName(String Name);
	public List<Users> selectAll();
	
}
