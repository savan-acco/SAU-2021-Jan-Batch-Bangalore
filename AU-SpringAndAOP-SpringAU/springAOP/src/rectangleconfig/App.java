package rectangleconfig;

import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.au.spring.Triangle;

public class App {
	
public static void main(String[] args) throws IOException {
		
		//Handle bean's after init/destroy activities
		AbstractApplicationContext factory = new FileSystemXmlApplicationContext("spring.xml"); 	      
		factory.registerShutdownHook();
		Triangle triangle = (Triangle)factory.getBean("triangle");//bean id
		triangle.getTheCordinates();

	}


}
