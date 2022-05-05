package DaringDuck;

import java.util.*;


public class TuringMachineRunner{
    static ArrayList<Character> input = new ArrayList<Character>();
    static Tape tape;
    // static ArrayList<Transition> transitionsList1 = new ArrayList<Transition>();
    // static ArrayList<Transition> transitionsList2 = new ArrayList<Transition>();
    // static ArrayList<Transition> transitionsList3 = new ArrayList<Transition>();
    static ArrayList<State> statesList = new ArrayList<State>();
    // static State s0, s1, s2, s3;
    // static Transition t1, t2, t3;
    static ArrayList<Transition> s0transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s1transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s2transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s3transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s4transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s5transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s6transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s8transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s9transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s10transitionsList =  new ArrayList<Transition>();
    static ArrayList<Transition> s11transitionsList =  new ArrayList<Transition>();
    static StateMachine turingTest;
    static State s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11;
    static Transition s0t1, s0t2, s1t1, s1t2, s1t3, s2t1, s3t1, s4t1, s4t2, s4t3, s5t1, s5t2, s5t3, s6t1, s6t2, s8t1, s9t1, s10t1, s11t1;
    public static void main(String[] args) {   
        // list.add('0'); 
        // list.add('0');
        // list.add('0');  
        // tape = new Tape(list);

        // s3 = new State("s2", "halt");

        // t3 = new Transition(s3, '0', '1', "right");
        // transitionsList3.add(t3);
        // s2 = new State("s2", "NH", transitionsList3);

        // t2 = new Transition(s2, '0', '1', "right");
        // transitionsList2.add(t2);
        // s1 = new State("s1", "NH", transitionsList2);
        
        // t1 = new Transition(s1, '0', '1', "right");
        // transitionsList1.add(t1);
        // s0 = new State("s0", "NH", transitionsList1);

        // statesList.add(s0);
        // statesList.add(s1);
        // statesList.add(s2);

        // turingTest = new StateMachine(statesList, s0, list);
        // turingTest.dealWithTape();
        
        //tape: 22222
        for(int i = 0; i < 60; i++){
            input.add('2'); 
        }
        tape = new Tape(input);

        //s6: halt state
        s7 = new State("s7", "halt");

        //s5: 2 transitions (2/2,L -> s5) (1/1,R -> s0) 
        s6t1 = new Transition("s6", '2', '2', "left");
        s6t2 = new Transition("s0", '1', '1', "right");
        s6transitionsList.add(s6t1);
        s6transitionsList.add(s6t2);
        s6 = new State("s6", "NH", s6transitionsList);
        
        //s4: 2 transitions (1/1,L -> s4) (2/2,L -> s5)
        s5t1 = new Transition("s5", '1', '1', "left");
        s5t2 = new Transition("s6", '2', '2', "left");
        s5t3 = new Transition("s7", 'N', '1', "right");
        s5transitionsList.add(s5t1);
        s5transitionsList.add(s5t2);
        s5transitionsList.add(s5t3);
        s5 = new State("s5", "NH", s5transitionsList); 

        //s4: 1 transition (null/1,R -> s4)
        s4t1 =  new Transition("s5", 'N', '1', "left");
        s4transitionsList.add(s4t1);
        s4 = new State("s4", "NH", s4transitionsList);

        //s3: 1 transition (null/1,R -> s4)
        s11t1 =  new Transition("s4", 'N', '1', "right");
        s11transitionsList.add(s11t1);
        s11 = new State("s11", "NH", s11transitionsList);

        //s3: 1 transition (null/1,R -> s4)
        s10t1 =  new Transition("s11", 'N', '1', "right");
        s10transitionsList.add(s10t1);
        s10 = new State("s10", "NH", s10transitionsList);

        //s3: 1 transition (null/1,R -> s4)
        s9t1 =  new Transition("s10", 'N', '1', "right");
        s9transitionsList.add(s9t1);
        s9 = new State("s9", "NH", s9transitionsList);

        //s3: 1 transition (null/1,R -> s4)
        s8t1 =  new Transition("s9", 'N', '1', "right");
        s8transitionsList.add(s8t1);
        s8 = new State("s8", "NH", s8transitionsList);

        //s3: 1 transition (null/1,R -> s4)
        s3t1 =  new Transition("s8", 'N', '1', "right");
        s3transitionsList.add(s3t1);
        s3 = new State("s3", "NH", s3transitionsList);

        //s2: 1 transition (null/1, R  -''> s3)
        s2t1 =  new Transition("s3", 'N', '1', "right");
        s2transitionsList.add(s2t1);
        s2 = new State("s2", "NH", s2transitionsList);

  
        //s1: 2 transitions (2/2, R -> s1) (null/1, R -> s2)
        s1t1 = new Transition("s1", '2', '2', "right");
        s1t2 = new Transition("s1", '1', '1', "right");
        s1t3 = new Transition("s2", 'N', '1', "right");
        s1transitionsList.add(s1t1);
        s1transitionsList.add(s1t2);
        s1transitionsList.add(s1t3);
        s1 = new State("s1", "NH", s1transitionsList);

        //s0: 2 transitions (1/1,R -> s6) (2/1,R -> s1)
        s0t1 = new Transition("s1", '2', '1', "right");
        s0transitionsList.add(s0t1);
        s0 = new State("s0", "NH", s0transitionsList);

        statesList.add(s0);
        statesList.add(s1);
        statesList.add(s2);
        statesList.add(s3);
        statesList.add(s4);
        statesList.add(s5);
        statesList.add(s6);
        statesList.add(s7);
        statesList.add(s8);
        statesList.add(s9);
        statesList.add(s10);
        statesList.add(s11);

        turingTest = new StateMachine(statesList, s0, input);
        turingTest.dealWithTape();
        

        /**
        same code as above but with for loop going from states s2-s202, for loop is:
        for(int i = 0; i < 200; i++){
            
        }
         
        int count = 0;
        for (State state : statesList){
            if (state.getType().equals("halt")){
                for (int i = 0; i < list.size(); i++){
                    if (list.get(i) == '1'){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        */

        /* 
        list.add("0");
        list.add("1"); 
        list.add("1");
        list.add("1");
        tape = new Tape(list);

        t1 = new Transition(s0, "0", "1", "R");
        t2 = new Transition(s0, "1", "1", "R");
        t3 = new Transition(s1, "null", "null", "L");
        transitionsList1 = new ArrayList<Transition>();
        transitionsList1.add(t1);
        transitionsList1.add(t2);
        transitionsList1.add(t3);

        s0 = new State("S0", "not halt", transitionsList1);

        s1 = new State("S1", "halt");

        System.out.println(tape.toString());

        if (s0.getType() == "halt" || s0.getType() == "halt"){
            break;
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++){
                if ((list.get(i)).charAt(x) == '1'){
                    count++;
                }
            }
        }
        System.out.println(count);
        */

        
         


    }
}