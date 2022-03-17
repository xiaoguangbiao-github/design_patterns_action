package com.xiaoguangbiao.pattern.state.before;

/**
 * @version v1.0
 * @ClassName: ILift
 * @Description: 电梯接口
 * @Author: xiaoguangbiao-github
 */
public interface ILift {

    //定义四个电梯状态的常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    //设置电梯状态的功能
    void setState(int state);

    //电梯操作功能
    void open();

    void close();

    void run();

    void stop();
}
