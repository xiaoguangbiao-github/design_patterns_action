package com.xiaoguangbiao.pattern.state.after;

/**
 * @version v1.0
 * @ClassName: OpeningState
 * @Description: 电梯开启状态类
 * @Author: xiaoguangbiao-github
 */
public class OpeningState extends LiftState {
    //当前状态要执行的方法
    public void open() {
        System.out.println("电梯开启。。。");
    }

    public void close() {
        //修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用当前状态中的context中的close方法
        super.context.close();
    }

    public void run() {
        //什么都不做
    }

    public void stop() {
        //什么都不做
    }
}
