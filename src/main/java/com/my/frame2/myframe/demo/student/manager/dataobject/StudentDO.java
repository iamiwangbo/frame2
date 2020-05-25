package com.my.frame2.myframe.demo.student.manager.dataobject;


import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 *
 * @author wangbo
 * @date 2020/5/25
 */
@Data
@Table(name = "student")
public class StudentDO implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

}
