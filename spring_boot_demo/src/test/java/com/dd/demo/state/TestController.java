package com.dd.demo.state;

import com.dd.demo.BaseTest;
import org.junit.Test;
import org.springframework.statemachine.StateMachine;

import javax.annotation.Resource;

/**
 * @description:
 * @author: dd Date: 2018/5/3 Time: 16:51
 * @version: 1.0.0
 */
public class TestController extends BaseTest {
    @Resource
    private StateMachine<Status, Events> stateMachine;

    @Test
    public void testMachine() {
        stateMachine.start();
        stateMachine.sendEvent(Events.CIN);
        stateMachine.sendEvent(Events.CIN);
    }
}
