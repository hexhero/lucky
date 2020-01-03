package com.yangb.lotto.ctrl;

import com.yangb.lotto.bean.ResultObj;
import com.yangb.lotto.bean.User;
import com.yangb.lotto.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * lotto
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
