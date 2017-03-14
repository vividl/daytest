package com.lishiwei.springtest.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by lishiwei on 17-2-10.
 */
@Data
public class User {
    private long   userId;
    private String userName;
    private long   credits;
    private String password;
    private Date   lastVisit;
    private String lastIp;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
