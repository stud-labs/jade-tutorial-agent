package com.ideaheap.tutorial.jade.agents.sample;

import com.ideaheap.tutorial.jade.agents.sample.behaviours.MySimpleBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jade.core.Agent;

public class MyAgent extends Agent{
    public Integer state = 0;
    public void setup() {
        final String otherAgentName = (String) this.getArguments()[0];
        addBehaviour(new MySimpleBehaviour(this, otherAgentName));
    }
}
