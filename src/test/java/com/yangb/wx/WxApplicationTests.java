package com.yangb.wx;

import com.yangb.wx.bean.User;
import com.yangb.wx.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WxApplicationTests {

    @Autowired
    UserRepository userR;

    @Test
    public void contextLoads() {
        System.out.println("插入用户");
        User user = new User();
        user.setName("张三");
        user.setTel("159128371823");
        userR.save(user);

        System.out.println("输出用户");
        Iterable<User> all = userR.findAll();
        for (User user1 : all) {
            System.out.println(user1.getName() + user1.getTel());
        }
    }

    @Test
    public void findU(){
        System.out.println("输出用户");
        Iterable<User> all = userR.findAll();
        for (User user1 : all) {
            System.out.println(user1.getName() + user1.getTel());
        }
    }
}

