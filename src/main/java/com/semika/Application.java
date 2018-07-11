/**
 * 
 */
package com.semika;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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
		app.run(args); 
	}
}


//java -jar target/myapplication-0.0.1-SNAPSHOT.jar , plain start of spring boot
//java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n -jar target/myapplication-0.0.1-SNAPSHOT.jar, start to debug the application
// java -jar myproject-0.0.1-SNAPSHOT.jar --debug , staring spring boot application with debug log enable.
//java --server.port=9000 -jar target/myapplication-0.0.1-SNAPSHOT.jar    , start the application with specific port
//java -jar -Dspring.profiles.active=production demo-0.0.1-SNAPSHOT.jar,  -D parameter can be set 

//java -Dspring.profiles.active=development -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n -jar target/user-0.0.1-SNAPSHOT.jar --port=9000

