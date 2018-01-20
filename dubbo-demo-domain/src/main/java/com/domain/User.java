package com.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @author created by wangyong on 18-1-17
 */
@Data
@NoArgsConstructor
public class User implements Serializable {

  private static final long serialVersionUID = 4401046892272121329L;

  /**
   * 用户编号,用户名,邮箱
   */
  private String userId, userName, email;


  public User(String userId, String userName, String email) {
    this.userId = userId;
    this.userName = userName;
    this.email = email;
  }
}
