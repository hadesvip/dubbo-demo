package com.consumer;

import com.domain.User;
import com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Console {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        new String[]{"classpath*:dubbo-demo-consumer.xml"});

    applicationContext.start();

    UserService userService = (UserService) applicationContext.getBean("userService");

    User user = userService.getUserById("001");

    System.out.println(user);
    System.out.println(user.toString());
  }
}
