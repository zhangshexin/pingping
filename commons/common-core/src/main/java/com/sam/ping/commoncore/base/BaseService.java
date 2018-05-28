package com.sam.ping.commoncore.base;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangshexin
 * @createTime 2018/5/25
 */
public abstract class BaseService<T extends BaseEntity,D extends BaseDao<T>> {
    @Autowired
    protected D dao;

    public int deleteByPrimaryKey(Integer id){
        return dao.deleteByPrimaryKey(id);
    }

    public int insert(T record){
        return dao.insert(record);
    }

    public int insertSelective(T record){
        return dao.insertSelective(record);
    }

    public T selectByPrimaryKey(Integer id){
        return dao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T record){

        return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record){
        return dao.updateByPrimaryKey(record);
    }
}
