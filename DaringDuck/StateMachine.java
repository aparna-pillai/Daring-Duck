package DaringDuck;

import java.util.*;

public class StateMachine{
    private ArrayList<State> states = new ArrayList<State>();
    //private ArrayList<String> states = new ArrayList<String>(1);
    private State currentState;
    private char currentTapeVal;

    private Tape tape;

    public StateMachine(ArrayList<State> states, State currentState, ArrayList<Character> input) {
        this.states = states;
        this.currentState = currentState;
        tape = new Tape(input);
    }

    public State getCurrentState(){
        return currentState;
    }
 //move (input) --> get next transition based on the state from getCurrentState
    public void dealWithTape(){
        //System.out.println(currentState);
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
        //System.out.println("hi");
        while(!currentState.isHalt()){
            currentTapeVal = tape.read();
            System.out.println("CurrentTapeVal: " + currentTapeVal);
            //System.out.println('2');
            ArrayList<Transition> transitions = currentState.getTransition();

            //s1t1 = new Transition(s1, '2', '2', "right");
        //s1t2 = new Transition(s2, '1', '1', "right");
        //s1t3 = new Transition(s2, 'N', '1', "right"); 

            Transition takeTran = getNextTransition(transitions, currentTapeVal);
            //System.out.println("Take tran: " + takeTran);
            if(takeTran == null){
                break;
            }
            tape.write(takeTran.getWrite());
            if(takeTran.getDirection().equals("left")){
                tape.moveLeft();
            }
            else if(takeTran.getDirection().equals("right")){
                tape.moveRight();
            }
            if (!(currentState.getName().equals(takeTran.getNextState()))){
                currentState = getStatefromName(takeTran);
            }
            System.out.println(tape.oneCount());
            System.out.println(tape);
            //System.out.println("Current State: " + currentState.getName());
        }
        //System.out.println(tape);
    }
    
    public State getStatefromName(Transition transition){
        for (int i = 0; i < states.size(); i++){
            if (states.get(i).getName().equals(transition.getNextState())){
                return states.get(i);
            }
        }
        return null;
    }

    public Transition getNextTransition(ArrayList<Transition> transitions, char currentTapeVal){
        for(int i = 0; i < transitions.size(); i++){
            Transition tempTran = transitions.get(i);
            //System.out.println(tempTran);
            //if the transition's read matches the current value of the tape
            if(tempTran.getRead() == currentTapeVal) {
                System.out.println("Next State: " + tempTran.getNextState());
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