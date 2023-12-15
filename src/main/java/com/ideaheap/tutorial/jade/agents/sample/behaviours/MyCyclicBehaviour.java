package com.ideaheap.tutorial.jade.agents.sample.behaviours;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ideaheap.tutorial.jade.agents.sample.MyAgent;

public class MyCyclicBehaviour extends CyclicBehaviour {

    private MyAgent agent;
    private static final Logger logger = LoggerFactory.getLogger(IncrementBaseNumber.class);

    public MyCyclicBehaviour(MyAgent agent) {
        this.agent = agent;
    }

    @Override
    public void action() {
        logger.info("Cyclic step!!!");
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (Exception e){
            logger.info("WARNING: Excaption: " + e.toString() + ".");
        }       
    }

}
