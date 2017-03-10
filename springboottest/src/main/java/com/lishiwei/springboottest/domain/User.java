package com.lishiwei.springboottest.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private long   userId;
    private String userName;
    private long   credits;
    private String password;
    private Date   lastVisit;
    private String lastIp;
}