package cn.jsonqiao.prj.wechat.service;

import java.util.List;

/**
 * Created by jsonqiao on 16/8/19.
 */
public interface BaseService<T> {

    void insert(T t);

    int update(T t);

    int deleteById(long id);

    List<T> queryAll();
}
