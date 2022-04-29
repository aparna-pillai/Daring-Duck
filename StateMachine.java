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
        /**
        get the value at the current position in the tape
        compare the value with the current state's transitions' read
        if a match is found, move to the "to" state in read and assign currentState to the "to" state
        replace the current value of the tape's current value with the "write" value in the transition
        move tape to the left or right by changing current position in tape by what transition dictates
        keep looping until a halt state is reached 

        while (!currentState.isHalt())
         */
        int currentPosTape = 0;
        while(!currentState.isHalt()){
            char currentTapeVal = input.read();
            ArrayList<Transition> transitions = currentState.getTransition();

            //loop through transitions and check the reads of each state until match is found
            for(int i = 0; i < transitions.size(); i++){
                Transition tempTran = transitions.get(i);
                //if the transition's read matches the current value of the tape
                if(tempTran.getRead().equals(currentTapeVal)){
                    currentState = tempTran.getNextState();
                    input.write(tempTran.getWrite());

                    //move the tape left or right
                    if(tempTran.getDirection() == "left"){
                        input.moveRight();
                    }
                    else{
                        input.moveLeft();
                    }
                }
            }
        }
        //after it halts?
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

