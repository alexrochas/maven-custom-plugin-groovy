package br.com.alex.plugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PluginApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PluginApplication.class, args);

		CustomPluginConfig customConfig = context.getBean(CustomPluginConfig.class);
		System.out.println(customConfig.getGreeting());
	}

}
