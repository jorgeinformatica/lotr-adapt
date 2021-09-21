package lotr.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

/**
 * The Class SpringFoxConfig.
 */
@Configuration
public class SpringFoxConfig {

	/**
	 * Api.
	 *
	 * @return the docket
	 */
	@Bean
	public OpenAPI customOpenAPI(@Autowired(required = false) BuildProperties buildProperties) {
		return new OpenAPI().addServersItem(new Server().url("/lotr"))
				.info(new Info().title("API Dados")
						.version((buildProperties != null) ? buildProperties.getVersion() : "SNAPSHOT").description("")
						.license(new License().name("License: RIDMC (REPUBLICA INDEPENDIENTE DE MI CASA)")));
	}
}
