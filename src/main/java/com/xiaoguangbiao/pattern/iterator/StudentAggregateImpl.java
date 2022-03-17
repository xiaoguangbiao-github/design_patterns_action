package com.xiaoguangbiao.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: StudentAggregateImpl
 * @Description: TODO(一句话描述该类的功能)
 * @Author: xiaoguangbiao-github
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<Student>();

    public void addStudent(Student stu) {
        list.add(stu);
    }

    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    //获取迭代器对象
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
