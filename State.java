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

    public boolean isHalt(){ 
        if (type == "halt"){
            return true;
        }
        return false;
    }

    public ArrayList<Transition> getTransition(){
        return transitions;
    }
    
    /** 
    public boolean isRegular(){ 
        return type.equals("L"); 
    }
    public boolean right(){ 
        return type.equals("R"); 
    }
    public boolean accept(){ 
        return type.equals("A"); 
    }
    public boolean reject(){ 
        return type.equals("Re"); 
    }
    
    public String getName(){ 
        return name; 
    }

     */ 

   public String toString() {
       return "Name: " + name + ", State type: " + type + ", Transitions: " + transitions;
   } 
  
}

/**
 * need to know name, whether its a halt or not; what transitions it has (arraylist of transitions)
 */