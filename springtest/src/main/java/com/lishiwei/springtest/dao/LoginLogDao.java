package com.lishiwei.springtest.dao;

import com.lishiwei.springtest.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lishiwei on 17-3-13.
 */
@Repository
public class LoginLogDao implements IBaseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int update(Object o) {
        String sqlStr = "INSERT INTO login_log(user_id, ip, login_datetime) VALUES(?, ?, ?)";
        LoginLog loginLog = (LoginLog) o;
        Object[] objects = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDatetime()};
        jdbcTemplate.update(sqlStr, objects);
        return 1;
    }

    @Override
    public int query(Object o) {
        return 0;
    }
}
