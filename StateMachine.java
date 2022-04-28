import java.util.*;

public class StateMachine extends State{
    private ArrayList<State> states = new ArrayList<State>();
    //private ArrayList<String> states = new ArrayList<String>(1);
    private State currentState;

    public StateMachine(ArrayList<String> states, String currentState) {
        this.states = states;
        this.type = type;
    }
}
/**
Create an arraylist of state objects call and take transition as a parameter?ed states that holds every state
Create a state object called currentState
Moves within the arraylist "states" and changes currentState to the new state in the arraylist 
Create a tape object that can be moved left or right depending on what "currentState" dictates should happen
 */


/**
 * We implement a Turing machine as a tape,
 * a symbol table of states, and a symbol table of transitions.
 */