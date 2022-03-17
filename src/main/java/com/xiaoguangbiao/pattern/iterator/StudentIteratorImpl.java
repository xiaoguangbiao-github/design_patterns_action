package com.xiaoguangbiao.pattern.iterator;

import java.util.List;

/**
 * @version v1.0
 * @ClassName: StudentIteratorImpl
 * @Description: 具体迭代器角色类
 * @Author: xiaoguangbiao-github
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0;//用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return position < list.size();
    }

    public Student next() {
        //从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
