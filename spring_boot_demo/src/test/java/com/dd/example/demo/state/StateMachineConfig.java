package com.dd.example.demo.state;

import java.util.EnumSet;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

@Configuration
@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<Status, Events> {
    private StateMachineTransitionConfigurer<Status, Events> transitions;
    @Override
    public void configure(StateMachineStateConfigurer<Status, Events> states)
            throws Exception {
        states.withStates()
                .initial(Status.START)
                .states(EnumSet.allOf(Status.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<Status, Events> transitions)
            throws Exception {
//        this.transitions =transitions;
        transitions
                .withExternal()
                .source(Status.START).target(Status.ING)
                .event(Events.CIN)
                .and()
                .withExternal()
                .source(Status.ING).target(Status.END)
                .event(Events.COUT);
    }

    @Override
    public void configure(StateMachineConfigurationConfigurer<Status, Events> config)
            throws Exception {
    }
}