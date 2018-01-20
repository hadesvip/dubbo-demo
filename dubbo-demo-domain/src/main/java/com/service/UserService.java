package com.service;

import com.domain.User;

/**
 * 用户服务
 *
 * @author created by wangyong on 18-1-17
 */
public interface UserService {

  /**
   * 根据用户编号获取用户信息
   *
   * @param userId 用户编号
   */
  User getUserById(String userId);

}
