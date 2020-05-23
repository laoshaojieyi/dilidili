package users.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import org.springframework.stereotype.Service;

import users.entity.Users;

@Service
public class UsersServiceImp implements UsersService {
	
	private SqlSession session;
	

	
	public int deleteUser(int id) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		users.deleteUser(id);
		session.commit();
		return 1;
	}


	public int blackUser(int id) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		users.blackUser(id);
		session.commit();
		return 0;
	}


	public int freezeUser(int id) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		users.freezeUser(id);
		session.commit();
		return 0;
	}


	public int fireUser(int id) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		users.fireUser(id);
		session.commit();
		return 0;
	}

	
	public List<Users> selectUserById(int id) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		List<Users> user=users.selectUserById(id);
		session.commit();
		return user;
	}

	public List<Users> selectAll() {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		List<Users> usersList=users.selectAll();
		session.commit();
		return usersList;
	}


	@Override
	public int setUservip(int id) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		users.setUservip(id);
		session.commit();
		return 0;
	}


	@Override
	public List<Users> selectUserByTelnum(String Telnum) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		List<Users> user=users.selectUserByTelnum(Telnum);
		return user;
	}


	@Override
	public List<Users> selectUserByName(String Name) {
		SqlSessionFactory ssf = null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		session = ssf.openSession();
		UsersService users = session.getMapper(UsersService.class);
		List<Users> user=users.selectUserByName(Name);
		return user;
	}

	


}
