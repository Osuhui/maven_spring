package jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiwl.dao.UserDao;

public class JdbcTest {

	String xmlPath = "ApplicationContext.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void test01() {

		UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

		userDao.addUserDao();
	}

}
