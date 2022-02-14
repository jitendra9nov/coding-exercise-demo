/*  © 2022 */
package com.code.exercise.config;

import static java.util.concurrent.Executors.newFixedThreadPool;

import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class provides spring configurations that a class declares one or more @Bean methods and may
 * be processed by the Spring container to generate bean definitions and service requests for those
 * beans at runtime
 *
 * @author jitendrabhadouriya
 */
@Configuration
public class AppConfig {

  @Value("${sample.value:5}")
  private int numberOfThreads;


  /**
   * This provides bean for {@code ExecutorService} class
   *
   * @return
   */
  @Bean
  public ExecutorService executorService() {
    return newFixedThreadPool(numberOfThreads);
  }
}
