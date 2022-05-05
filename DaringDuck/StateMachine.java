package DaringDuck;

import java.util.*;

public class StateMachine{
    private ArrayList<State> states = new ArrayList<State>();
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

    public void dealWithTape(){
        while(!currentState.isHalt()){
            currentTapeVal = tape.read();
            ArrayList<Transition> transitions = currentState.getTransition();

            Transition takeTran = getNextTransition(transitions, currentTapeVal);

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
        }
        System.out.println("Number of 1's: " + tape.oneCount());
        System.out.println("Score: " + tape.oneCount()/(113 + 3 + 3000));

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
            if(tempTran.getRead() == currentTapeVal) {
                return tempTran;
            }
        }
        return null;
    }
}