package com.shukai.ebook.service;

import com.shukai.ebook.bean.Permission;
import com.shukai.ebook.bean.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public User getUserByAccount(String account);
    public User getUserByMail(String mail);
    public List<User> getAllUser();
    public int changeAllowed(String account);
    public List<Permission> getPermissionByName(String name);
}
