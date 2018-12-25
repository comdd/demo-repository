package com.dd.demo.state;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

/**
 * @description:
 * @author: dd Date: 2018/5/3 Time: 17:05
 * @version: 1.0.0
 */
@WithStateMachine
public class EventListener {
    @OnTransition(target = "START")
    public void create() {
        System.out.println("-------活动开始");
    }

    @OnTransition(source = "START", target = "ING")
    public void ing() {
        System.out.println("---------活动进行时");
    }

    @OnTransition(source = "ING", target = "END")
    public void end() {
        System.out.println("---------活动结束");
    }
}
