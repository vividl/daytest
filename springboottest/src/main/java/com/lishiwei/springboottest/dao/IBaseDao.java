package com.lishiwei.springboottest.dao;

/**
 * Created by lishiwei on 17-3-10.
 */
public interface IBaseDao<T> {
    int query(T t);
}
