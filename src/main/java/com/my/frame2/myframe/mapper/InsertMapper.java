package com.my.frame2.myframe.mapper;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;

/**
 * @author wangbo
 * @date 2020/5/25
 */
public interface InsertMapper<T> extends Marker, BaseInsertMapper<T>, MySqlMapper<T> {
}
