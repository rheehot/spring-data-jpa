package com.googlecode.hotire.springdatajpa;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import java.util.TimeZone;

@SpringBootApplication
public class Application implements InitializingBean {

  @Autowired @Qualifier("coreRepository")
  private JpaRepositoryFactoryBean factoryBean;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
  }
}
