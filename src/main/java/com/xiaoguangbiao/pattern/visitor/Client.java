package com.xiaoguangbiao.pattern.visitor;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: xiaoguangbiao-github
 */
public class Client {
    public static void main(String[] args) {
        //创建Home对象
        Home home = new Home();
        //添加元素到Home对象中
        home.add(new Dog());
        home.add(new Cat());

        //创建主人对象
        Owner owner = new Owner();
        //让主人喂食所有的宠物
        home.action(owner);
    }
}
