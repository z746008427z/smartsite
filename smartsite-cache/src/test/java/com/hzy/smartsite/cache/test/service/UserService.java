package com.hzy.smartsite.cache.test.service;

import com.hzy.smartsite.cache.test.entity.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserService {
    public User get(String account);

    public List<User> getLlist();

    public Set<User> getSet();

    public Map<String, User> getMap();

    public void save(User user);

    public User get(int age);
}
