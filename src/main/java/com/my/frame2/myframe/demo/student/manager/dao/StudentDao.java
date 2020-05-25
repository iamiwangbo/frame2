package com.my.frame2.myframe.demo.student.manager.dao;

import com.my.frame2.myframe.demo.student.manager.dataobject.StudentDO;
import com.my.frame2.myframe.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 *
 * @author wangbo
 * @date 2020/5/25
 */
@Mapper
public interface StudentDao extends CrudMapper<StudentDO> {
}
