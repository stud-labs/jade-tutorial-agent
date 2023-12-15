.PHONY: run main

run:  src/main/java/com/ideaheap/tutorial/jade/agents/sample/MyAgent.java src/main/java/com/ideaheap/tutorial/jade/agents/sample/behaviours/MySimpleBehaviour.java
	    mvn -Pjade-agent exec:java

main:
		mvn -Pjade-main exec:java