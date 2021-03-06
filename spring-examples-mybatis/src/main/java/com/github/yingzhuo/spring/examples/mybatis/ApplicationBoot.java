package com.github.yingzhuo.spring.examples.mybatis;

import com.github.yingzhuo.spring.examples.mybatis.dao.UserDao;
import com.github.yingzhuo.spring.examples.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationBoot implements ApplicationRunner {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args).close();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(userMapper.findById("1"));
        System.out.println(userDao.findAllUsers());
    }

}
