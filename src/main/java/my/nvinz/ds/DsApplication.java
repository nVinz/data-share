package my.nvinz.ds;

import my.nvinz.ds.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DsApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		//SpringApplication.run(DsApplication.class, args);

		ProjectDriver projectDriver = context.getBean("projectDriver", ProjectDriver.class);

		System.out.println(projectDriver.getProjects().toString());
	}

}
