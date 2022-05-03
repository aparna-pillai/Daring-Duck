package DaringDuck;

import java.util.*;

public class StateMachine{
    private ArrayList<State> states = new ArrayList<State>();
    //private ArrayList<String> states = new ArrayList<String>(1);
    private State currentState;
    private Tape tape;

    public StateMachine(ArrayList<State> states, State currentState) {
        this.states = states;
        this.currentState = currentState;
    }

    public State getCurrentState(){
        return currentState;
    }
 //move (input) --> get next transition based on the state from getCurrentState
    public void dealWithTape(){
        /**
        get the value at the current position in the tape
        compare the value with the current state's transitions' read
        if a match is found, move to the "to" state in read and assign currentState to the "to" state
        replace the current value of the tape's current value with the "write" value in the transition
        move tape to the left or right by changing current position in tape by what transition dictates
        keep looping until a halt state is reached 

        while (!currentState.isHalt())
         */
        //int currentPosTape = 0;
        while(!currentState.isHalt()){
            char currentTapeVal = tape.read();
            ArrayList<Transition> transitions = currentState.getTransition();

            Transition takeTran = getNextTransition(transitions, currentTapeVal);
            if(takeTran == null){
                break;
            }
            tape.write(takeTran.getWrite());
            if(takeTran.getDirection().equals("left")){
                tape.moveLeft();
            }
            else{
                tape.moveRight();
            }
            currentState = takeTran.getNextState();
        }
        System.out.println(tape);
    }

    public Transition getNextTransition(ArrayList<Transition> transitions, char currentTapeVal){
        for(int i = 0; i < transitions.size(); i++){
            Transition tempTran = transitions.get(i);
            //if the transition's read matches the current value of the tape
            if(tempTran.getRead() == currentTapeVal) {
                return tempTran;
            }
        }
        return null;
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