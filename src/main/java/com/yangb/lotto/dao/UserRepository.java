package com.yangb.lotto.dao;

import com.yangb.lotto.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * lotto
 *
 * @author create by yangb in 2019/1/28
 */
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from #{#entityName} u where u.state is null")
    List<User> findEnableUser();
}
