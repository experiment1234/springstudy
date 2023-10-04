package com.gdu.app05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gdu.app05.service.BoardService;
import com.gdu.app05.service.BoardServiceImpl;

@Controller
public class BoardController {
  

  /*
   * DI
   * 1. Dependency Injection
   * 2. Spring Container에 저장된 객체를 가져오는 방식이다.
   * 3. 주요 Annotation
   *  1) @Inject
   *    (1) javax.inject.Inject
   *    (2) 타입이 일치하는 객체를 찾아서 가져온다. 없으면 오류가 발생한다.
   *    (3) 동일한 타입의 객체가 2개 이상 있다면 이름이 일치하는 객체를 가져온다.
   *  2) @Resource
   *    (1) javax.annotation.Resource
   *    (2) javax-annotation-api dependency를 pom.xml에 추가해야 사용할 수 있다.
   *      <!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
   *      <dependency>
   *        <groupId>javax.annotation</groupId>
   *        <artifactId>javax.annotation-api</artifactId>
   *        <version>1.3.2</version>
   *      </dependency>
   *    (3) 이름이 일치하는 객체를 찾아서 가져온다. 없으면 오류가 발생한다.
   *  3) @Autowired
   *    (1) org.springframework.beans.factory.annotation.Autowired
   *    (2) @Inject 기반의 Spring Annotation이다. (타입 기반)
   *    (3) 객체 이름을 기준으로 가져올 수 있도록 @Qualifier(org.springframework.beans.factory.annotation.Qualifier)를 사용할 수 있다.
   */
  
  /*
   * BoardService DI 처리 방법
   * 
   * 1. BoardService 타입의 BoardServiceImpl 객체를 Spring Container에 넣는다. (아래 3가지 방법 중 하나 이용)
   *  1) <bean> 태그            : /WEB-INF/spring/root-context.xml
   *  2) @Configuration + @Bean : com.gdu.app05.config.AppConfig.java
   *  3) @Component
   * 
   * 2. @Autowired를 이용해서 Spring Container에서 BoardService 타입의 객체를 가져온다. (아래 3가지 방법 중 하나 이용)
   *  1) 필드에 주입하기
   *  2) 생성자에 주입하기
   *  3) Setter 형식의 메소드에 주입하기
   */

  @Autowired
  private BoardService boardService;
  
  @RequestMapping(value="/board/list.do", method=RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("boardList", boardService.getBoardList());
    return "board/list";
  }
  
}