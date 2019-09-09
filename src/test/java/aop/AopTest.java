package aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiwl.service.UserService;

public class AopTest {
	
	String xmlPath = "AopContext.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void test01() {
		UserService userService = applicationContext.getBean("aopService", UserService.class);
		userService.addGenaralBean();
	}

}
