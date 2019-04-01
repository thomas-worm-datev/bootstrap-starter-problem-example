package sample.bootstrap_starter_problem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
@ImportResource({ "classpath:WEB-INF/applicationContext.xml" })
public class XmlConfiguration {

	public XmlConfiguration() {
		super();
	}

}
