package cn.jsonqiao.prj.wechat.mapper;

import java.util.List;

/**
 * Created by jsonqiao on 16/8/19.
 */
public interface BaseMapper<T> {

    void insert(T t);

    int update(T t);

    int deleteById(long id);

    List<T> queryAll();
}
