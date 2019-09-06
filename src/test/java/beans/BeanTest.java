package beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiwl.controller.UserController;
import com.huiwl.dto.User;
import com.huiwl.service.UserService;

public class BeanTest {

	String xmlPath = "ApplicationContext.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void test01() {

		UserService userService = applicationContext.getBean("GenaralBean", UserService.class);
		//普通bean
		userService.addGenaralBean();
	}

	@Test
	public void test02() {

		UserService userService = applicationContext.getBean("StaticBeanFactory", UserService.class);
		//静态工厂
		userService.addStaticBeanFactory();
	}

	@Test
	public void test03() {

		UserService userService = applicationContext.getBean("UserService", UserService.class);
		//实例工厂
		userService.addBeanFactory();
	}

	@Test
	public void test04() {

		UserController userController = applicationContext.getBean("userController", UserController.class);
		//模拟WEB
		userController.addUser();
	}

	@Test
	public void test05() {

		User userDto = applicationContext.getBean("userDto", User.class);
		System.out.println(userDto);
	}

}
