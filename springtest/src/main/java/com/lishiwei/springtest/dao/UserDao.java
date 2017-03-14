package com.lishiwei.springtest.dao;

import com.lishiwei.springtest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lishiwei on 17-2-10.
 */
@Repository
public class UserDao implements IBaseDao<User> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int update(User user) {
        String s = "UPDATE user SET last_vist=?,";

        return jdbcTemplate.queryForList(s, user.getUserName(), user.getPassword()).size();
    }

    public int query(User user) {
        String s = "SELECT COUNT(*) FROM user WHERE user_name=? AND password=?";

        return jdbcTemplate.queryForList(s, user.getUserName(), user.getPassword()).size();
    }
}
