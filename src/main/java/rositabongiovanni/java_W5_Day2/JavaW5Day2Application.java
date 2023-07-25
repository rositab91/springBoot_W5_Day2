package rositabongiovanni.java_W5_Day2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import componentRunner.pizzRun;

@SpringBootApplication
public class JavaW5Day2Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JavaW5Day2Application.class, args);
		pizzRun pizzRun = new pizzRun();
		pizzRun.run(args);
	}
}
