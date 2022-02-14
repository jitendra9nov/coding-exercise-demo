/*  © 2022 */
package com.code.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is Spring Boot Application class which will start the application 
 *
 * @author jitendrabhadouriya
 */
@SpringBootApplication
public class Application{

  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  /**
   * This is main method to which will be called to start the Spring Boot Application.
   *
   * @param args
   */
  public static void main(final String[] args) {
	  LOGGER.info("Started");
    /*
     * Since this is not the web application, disabling all the web related
     * components.
     */
    final SpringApplication application = new SpringApplication(Application.class);
    application.run(args);
  }

}
