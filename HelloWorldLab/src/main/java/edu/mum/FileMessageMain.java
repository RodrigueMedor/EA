package edu.mum;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.mum.component.impl.FileMessageDisplay;

public class FileMessageMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext( JavaConfiguration.class );
		 
		FileMessageDisplay messageDisplay = (FileMessageDisplay) applicationContext.getBean("fileMessageDisplay");
         
			messageDisplay.display();
	
	}

}
