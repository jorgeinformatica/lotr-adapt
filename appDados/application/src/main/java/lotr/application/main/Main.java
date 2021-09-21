package lotr.application.main;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "lotr")
@EnableConfigurationProperties
public class Main {

	static ConfigurableApplicationContext context;

	/**
	 * The main method.
	 *
	 * @param args los arguments
	 */
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Main.class);
		application.setBannerMode(Banner.Mode.OFF);
		context = application.run(args);
	}

}
