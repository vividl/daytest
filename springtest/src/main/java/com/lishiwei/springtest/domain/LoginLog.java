package com.lishiwei.springtest.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by lishiwei on 17-2-10.
 */
@Data
public class LoginLog {
    private long   loginLogId;
    private long   userId;
    private String ip;
    private Date   loginDatetime;
}
