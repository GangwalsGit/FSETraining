package com.java.ui;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.config.JavaConfig;
import com.java.controller.CustomerLoginController;
import com.java.dto.CustomerLoginDTO;

public class UserInterface {

	private static final Log LOGGER = LogFactory.getLog(UserInterface.class);
	
	public static void main(String[] args) throws Exception {
		
		PropertiesConfiguration config = new Configurations().properties("configuration.properties");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		String beanNames[] = context.getBeanDefinitionNames();
		for(String name:beanNames)
		{
			System.out.println(name);
		}
		
		CustomerLoginController customerLoginController
        = context.getBean(CustomerLoginController.class);
		
		try {
			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			customerLoginDTO.setLoginName("harry");
			customerLoginDTO.setPassword("harry123");
			
			//CustomerLoginController customerLoginController = new CustomerLoginController();
			String message = customerLoginController.authenticateCustomer(customerLoginDTO);
			LOGGER.info(config.getProperty(message));
		} catch (Exception exception) {
			LOGGER.info(config.getProperty(exception.getMessage()));
		}
	}
}
