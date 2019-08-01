package simple.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import simple.MessageProvider;
import simple.MessageRenderer;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
		renderer.renderer();

		MessageProvider provider = context.getBean("provider", MessageProvider.class);
		System.out.println(provider.getMessage());
	}

}
