package cn.jsonqiao.prj.wechat.service.impl;

import cn.jsonqiao.prj.wechat.mapper.BaseMapper;

import java.util.List;

/**
 * Created by jsonqiao on 16/8/19.
 */
public abstract class BaseServiceImpl<T> implements BaseMapper<T> {

    protected abstract BaseMapper<T> getMapper();

    @Override
    public void insert(T t) {
        getMapper().insert(t);
    }

    @Override
    public int update(T t) {
        return getMapper().update(t);
    }

    @Override
    public int deleteById(long id) {
        return deleteById(id);
    }

    @Override
    public List<T> queryAll() {
        return getMapper().queryAll();
    }
}
