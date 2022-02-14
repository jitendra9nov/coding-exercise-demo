/*  © 2022 */
package com.log.analyzer;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.code.exercise.Application;
import com.code.exercise.config.AppConfig;

@SpringBootTest(classes = Application.class)
@TestPropertySource("classpath:application.properties")
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
class ApplicationTest {

	@Mock Application application;


  @Test
  void testMain_Unknown() {
    //Application.main(new String[] {"something"});
    //verify(application, never()).main(null);
  }
}
