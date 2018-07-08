/**
 * 
 */
package com.semika;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ApplicationStartupListener;

/**
 * @author semika
 *
 */

@Configuration 
@EnableAutoConfiguration 
@ComponentScan
//@SpringBootApplication // This includes  @Configuration ,  @ComponentScan, @EnableAutoConfiguration
//@Import({ MyConfig.class, MyAnotherConfig.class })
public class Application {

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(Application.class);
		app.addListeners(new ApplicationStartupListener()); 
		ApplicationContext applicationContext = app.run(args); 
		
		//System.exit(SpringApplication.exit(applicationContext));
		
	}
}

//java -jar target/myapplication-0.0.1-SNAPSHOT.jar , plain start of spring boot
//java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n -jar target/myapplication-0.0.1-SNAPSHOT.jar, start to debug the application
// java -jar myproject-0.0.1-SNAPSHOT.jar --debug , staring spring boot application with debug log enable.