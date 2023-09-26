package com.gdu.app01.anno01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //IoContainer에 bean을 등록하는 클래스이다. 
public class AppConfig {
  
  //메소드를 bean으로 등록하기 위해 @
  @Bean
  public Calculator calc() {
    return new Calculator();
  }
  
  @Bean
  public Person man() {
     Person person = new Person();
     person.setName("뽀로로");
     person.setAge(20);
     person.setCalculator(calc());
     return person;
  }
  
  @Bean
  public Person woman() {
    return new Person("루피", 20, calc());
  }

}
