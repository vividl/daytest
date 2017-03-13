package com.lishiwei.springtest.service;

import com.lishiwei.springtest.domain.User;

/**
 * Created by lishiwei on 17-3-13.
 */
public interface UserService {
    boolean hasMatchUser(User user);

    void loginSuccess(User user);

}
