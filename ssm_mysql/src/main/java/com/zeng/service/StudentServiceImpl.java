package com.zeng.service;

import com.zeng.dao.StudentMapper;
import com.zeng.pojo.Students;

import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService{
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int addStudent(Students students) {
        return studentMapper.addStudent(students);
    }

    public int delStudent(String sid) {
        return studentMapper.delStudent(sid);
    }

    public int updateStudent(Students students) {
        return studentMapper.updateStudent(students);
    }

    public List<Students> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    public List<Students> queryStudentChoose(Map map) {
        return studentMapper.queryStudentChoose(map);
    }

    public Students queryStudentBySid(String sid) {
        return studentMapper.queryStudentBySid(sid);
    }


    //事务测试
    public int transactionTest(){
        Students students = new Students("20183602111","zengjiabin",10,"nan");
        studentMapper.addStudent(students);
        studentMapper.delStudent("20183602111");
        return 1;
    }
}
