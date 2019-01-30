package com.yangb.wx.dao;

import com.yangb.wx.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * wx
 *
 * @author create by yangb in 2019/1/28
 */
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from #{#entityName} u where u.state is null")
    List<User> findEnableUser();
}
