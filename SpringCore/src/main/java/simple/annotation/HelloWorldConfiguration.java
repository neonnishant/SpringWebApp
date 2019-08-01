package simple.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import simple.HelloWorldMessageProvider;
import simple.MessageProvider;
import simple.MessageRenderer;
import simple.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
