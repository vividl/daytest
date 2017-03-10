package com.lishiwei.springtest.dao;

/**
 * Created by lishiwei on 17-2-10.
 */
public interface IBaseDao<T> {
    int update(T t);

    int query(T t);
}
