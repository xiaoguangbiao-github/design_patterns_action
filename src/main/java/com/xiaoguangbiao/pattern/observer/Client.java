package com.xiaoguangbiao.pattern.observer;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: xiaoguangbiao-github
 */
public class Client {
    public static void main(String[] args) {
        //1,创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //2,订阅公众号
        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("猪悟能"));
        subject.attach(new WeiXinUser("沙悟净"));

        //3,公众号更新，发出消息给订阅者（观察者对象）
        subject.notify("传智小黑的专栏更新了！");
    }
}
