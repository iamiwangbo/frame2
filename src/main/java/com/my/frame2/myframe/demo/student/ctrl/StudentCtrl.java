package com.my.frame2.myframe.demo.student.ctrl;

import com.my.frame2.myframe.demo.student.manager.dao.StudentDao;
import com.my.frame2.myframe.demo.student.manager.dataobject.StudentDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 *
 * @author wangbo
 * @date 2020/5/25
 */
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentCtrl {

    @Resource
    private StudentDao studentDao;

    @GetMapping("/list")
    public List<StudentDO> list(){
        return studentDao.selectAll();
    }

    @GetMapping("/create")
    public boolean create(){
        StudentDO student = new StudentDO();
        student.setName("王波");
        student.setAge(33);
        return studentDao.insert(student) > 0;
    }

}
