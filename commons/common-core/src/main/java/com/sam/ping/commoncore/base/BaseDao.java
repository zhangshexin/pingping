package com.sam.ping.commoncore.base;

/**
 * @author zhangshexin
 * @createTime 2018/5/25
 */
public interface BaseDao<T extends BaseEntity> {
    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
