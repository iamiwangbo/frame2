package com.my.frame2.myframe.mapper;


import tk.mybatis.mapper.annotation.RegisterMapper;

/**
 * @author wangbo
 * @date 2020/5/25
 */
@RegisterMapper
public interface CrudMapper<T> extends SelectMapper<T>, DeleteMapper<T>, InsertMapper<T>, UpdateMapper<T> {
}
