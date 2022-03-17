package com.xiaoguangbiao.pattern.mediator;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: xiaoguangbiao-github
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        //创建租房者对象
        Tenant tenant = new Tenant("李四",mediator);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三",mediator);

        //中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.constact("我要租三室的房子！！！");
        houseOwner.constact("我这里有三室的房子，你要租吗？");
    }
}
