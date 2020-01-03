package com.yangb.lotto.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * lotto
 *
 * @author create by yangb in 2019/1/28
 */
@Entity
@Data
public class User {

    @Id
    private String name;
    private String tel;
    private Short state;

}
