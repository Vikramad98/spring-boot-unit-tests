package com.myapp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myapp.dao.UserDao;

@Service
public class UserService {
   @Resource
   private UserDao userDao;

   public String getUser() {
       return userDao.getUser();
   }
}