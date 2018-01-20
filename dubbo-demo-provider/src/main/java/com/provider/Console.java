package com.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 程序入口
 *
 * @author created by wangyong on 18-1-17
 */
public class Console {

  public static void main(String[] args) throws Exception {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        new String[]{"classpath*:dubbo-demo-provider.xml"});
    context.start();

    System.in.read();
  }
}
