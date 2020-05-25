package com.my.frame2.myframe.mapper;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.delete.DeleteByPrimaryKeyMapper;
import tk.mybatis.mapper.common.condition.DeleteByConditionMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;

/**
 * @author wangbo
 * @date 2020/5/25
 */
public interface DeleteMapper<T> extends Marker, tk.mybatis.mapper.common.base.delete.DeleteMapper<T>, DeleteByPrimaryKeyMapper<T>,
        DeleteByConditionMapper<T>,
        DeleteByIdsMapper<T> {
}
