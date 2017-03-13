package com.lishiwei.springtest.service;

import com.lishiwei.springtest.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by lishiwei on 17-3-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void hasMatchUser() throws Exception {
        boolean admin = userService.hasMatchUser(new User("admin", "123456"));
        assertThat(admin, is(true));
    }

    @Test
    public void loginSuccess() throws Exception {

    }

}