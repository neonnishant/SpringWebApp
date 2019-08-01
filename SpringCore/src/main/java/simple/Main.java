package simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contexts/simple/appContext.xml");
		MessageRenderer messageRenderer = context.getBean("renderer", MessageRenderer.class);
		messageRenderer.renderer();
	}
}
