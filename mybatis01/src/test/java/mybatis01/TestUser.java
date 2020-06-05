package mybatis01;

import java.util.List;

import org.junit.Test;

import com.neutech.bean.User;
import com.neutech.dao.UserDao;
import com.neutech.dao.UserDaoImpl;

public class TestUser {

	@Test
	public void test() throws Exception {
		UserDao dao = new UserDaoImpl();
		List<User> users = dao.findAll();
		for(User u:users) {
			System.out.println(u.getUid()+"--"+u.getUname()+"--"+u.getPwd());
		}
		
	}

	@Test
	public void testAdd() throws Exception {
		UserDao dao = new UserDaoImpl();
		//准备数据
		User user = new User();
		user.setUname("caixukun");
		user.setPwd("123");
		
		dao.addUser(user);
	}
	
	
	@Test
	public void testFindById() throws Exception {
		UserDao dao = new UserDaoImpl();
		User user = dao.findUserById(4);
		System.out.println(user.getUid()+"--"+user.getUname()+"--"+user.getPwd());
		
	}
	
	@Test
	public void testDeleteById() throws Exception {
		UserDao dao = new UserDaoImpl();
		dao.deleteUser(5);
	
		
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		//准备数据
		User user = new User();
		
		user.setUid(7);
		user.setUname("caixuhun6");
		user.setPwd("kkk");
		
		UserDao dao = new UserDaoImpl();
		dao.updateUser(user);
		
	}
}
