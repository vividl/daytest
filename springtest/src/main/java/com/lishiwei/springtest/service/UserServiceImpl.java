package com.lishiwei.springtest.service;

import com.lishiwei.springtest.dao.LoginLogDao;
import com.lishiwei.springtest.dao.UserDao;
import com.lishiwei.springtest.domain.LoginLog;
import com.lishiwei.springtest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lishiwei on 17-3-13.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao     userDao;
    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUser(User user) {
        return userDao.query(user) > 0;
    }

    public void loginSuccess(User user) {
        user.setCredits(user.getCredits() + 5);
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setUserId(user.getUserId());
        loginLog.setLoginDatetime(user.getLastVisit());
        userDao.update(user);
        loginLogDao.update(loginLog);
    }
}
