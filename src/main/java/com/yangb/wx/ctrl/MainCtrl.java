package com.yangb.wx.ctrl;

import com.yangb.wx.bean.User;
import com.yangb.wx.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * wx
 *
 * @author create by yangb in 2019/1/28
 */
@RestController
public class MainCtrl {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/lucky")
    public User getLucky(){
        //获取所有有资格参加抽奖的用户数组
        Iterable<User> iter = userRepository.findEnableUser();
        List<User> list = new ArrayList<>();
        for (User user : iter) {
            list.add(user);
        }
        User[] users = new User[list.size()];
        list.toArray(users);
        //使用 java.random 函数再一定范围内随机生成获奖用户索引
        int index = new Random().nextInt(users.length);
        //通过索引获取用户。
        User user = users[index];
        //下面的代码为了让已中奖的用户不能再次被抽中。
        user.setState((short) 1);
        userRepository.save(user);
        //返回此获奖用户信息
        return user;
    }
}
