package com.yangb.wx.ctrl;

import com.yangb.wx.bean.ResultObj;
import com.yangb.wx.bean.User;
import com.yangb.wx.dao.UserRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;

/**
 * wx
 *
 * @author create by yangb in 2019/1/28
 */
@RestController
@RequestMapping("/user")
public class UserCtrl {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResultObj userInfo(){
        Iterable<User> list = userRepository.findAll();
        return new ResultObj().makeSuccess(list);
    }

    @PostMapping
    public ResultObj add(@RequestBody User user){
        userRepository.save(user);
        return new ResultObj().makeSuccess();
    }
}
