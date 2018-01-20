package com.provider.service.impl;

import com.domain.User;
import com.service.UserService;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户服务实现类
 * @author created by wangyong on 18-1-17
 */
public class UserServiceImpl implements UserService {

  static final Map<String, User> USER_MAP = new HashMap<>(6);

  static {

    USER_MAP.put("001", new User("001", "admin", "admin@126.com"));
    USER_MAP.put("002", new User("002", "zhangsan", "zhangsan@126.com"));
    USER_MAP.put("003", new User("003", "lisi", "lisi@126.com"));

  }

  @Override
  public User getUserById(String userId) {
    return USER_MAP.get(userId);
  }
}
