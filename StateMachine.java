import java.util.*;

public class StateMachine{
    private ArrayList<State> states = new ArrayList<State>();
    //private ArrayList<String> states = new ArrayList<String>(1);
    private State currentState;
    private Tape input;

    public StateMachine(ArrayList<State> states, State currentState, Tape input) {
        this.states = states;
        this.currentState = currentState;
        this.input = input;
    }

    public State getCurrentState(){
        return currentState;
    }

    public void dealWithTape(){
        int stateNum = states.indexOf(currentState);
        currentState = states.get(stateNum++);
        for (int i = 0; i < (currentState.getTransition()).size(); i++)
            if (input.read() == (currentState.getTransition()).indexOf(i)){
                if 
            }
        input.moveLeft();
        input.moveRight();
    }
}
/**
 * hold states and tape
Create an arraylist of state objects call and take transition as a parameter?ed states that holds every state
Create a state object called currentState
Moves within the arraylist "states" and changes currentState to the new state in the arraylist 
Create a tape object that can be moved left or right depending on what "currentState" dictates should happen
 */

 //compare if input matches

