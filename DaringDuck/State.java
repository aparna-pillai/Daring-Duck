package DaringDuck;

import java.util.*;

public class State {
    private String name;
    private String type;
    public ArrayList<Transition> transitions = new ArrayList<Transition>();

    public State(String name, String type, ArrayList<Transition> transitions) {
        this.name = name;
        this.type = type;
        this.transitions = transitions;
    }
    
    public State(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public boolean isHalt(){ 
        if (type == "halt"){
            return true;
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public ArrayList<Transition> getTransition(){
        return transitions;
    }
    
   public String toString() {
       return "Name: " + name + ", State type: " + type + ", Transitions: " + transitions;
   } 
  
}