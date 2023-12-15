package com.ideaheap.tutorial.jade.agents.sample.behaviours;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ideaheap.tutorial.jade.agents.sample.MyAgent;

import jade.core.behaviours.OneShotBehaviour;

public class MyOneShotBehaviour extends OneShotBehaviour{
    private MyAgent agent;
    private static final Logger logger = LoggerFactory.getLogger(IncrementBaseNumber.class);

    MyOneShotBehaviour(MyAgent agent) {
        this.agent = agent;
    }

    public void action() {
        logger.info("One text");
    }    
}
