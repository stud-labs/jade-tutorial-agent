package com.ideaheap.tutorial.jade.agents.sample.behaviours;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ideaheap.tutorial.jade.agents.sample.MyAgent;
import com.ideaheap.tutorial.jade.tools.ContainerKiller;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

public class MySimpleBehaviour extends SimpleBehaviour{
    private MyAgent agent;
    private String otherAgentName; 

    private static final Logger logger = LoggerFactory.getLogger(IncrementBaseNumber.class);

    public MySimpleBehaviour(MyAgent agent, String otherAgentName) {
        this.agent = agent;
        this.otherAgentName = otherAgentName;
    }

    @Override
    public void action() {
        if (agent.state>10) {
            this.agent.removeBehaviour(this);
            // Kill myself
            ContainerKiller.killContainerOf(agent);
            return;
        };
        if (agent.state<=5) {
            logger.info("Hi! step: " + agent.state.toString() + "!");
        };
        if (agent.state == 1) {
            agent.addBehaviour(new MyCyclicBehaviour(agent));
        }
        if (agent.state == 3) {
            agent.addBehaviour(new MyOneShotBehaviour(agent));
        }
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (Exception e){
            logger.info("WARNING: Excaption: " + e.toString() + ".");
        }
        agent.state += 1;
        done();
    }

    @Override
    public boolean done() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'done'");
        return false;
    }
}
