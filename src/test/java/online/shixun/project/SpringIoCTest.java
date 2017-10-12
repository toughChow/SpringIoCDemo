package online.shixun.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import online.shixun.project.service.RegisterService;

@Component
public class SpringIoCTest {

	@Autowired
	private RegisterService registerService;

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpringIoCTest ioCTest = ctx.getBean(SpringIoCTest.class);
		
		ioCTest.testRegister();
		
		((ClassPathXmlApplicationContext)ctx).close();
		
	}
	
	public void testRegister(){
		registerService.doRegister();
	}
}
