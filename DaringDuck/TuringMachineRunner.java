package DaringDuck;

import java.util.*;


public class TuringMachineRunner{
    static ArrayList<Character> list = new ArrayList<Character>();
    static Tape tape;
    static ArrayList<Transition> transitionsList1 = new ArrayList<Transition>();
    static ArrayList<Transition> transitionsList2 = new ArrayList<Transition>();
    static ArrayList<Transition> transitionsList3 = new ArrayList<Transition>();
    static ArrayList<State> statesList = new ArrayList<State>();
    static State s0, s1, s2, s3;
    static Transition t1, t2, t3;
    static StateMachine turingTest;

    public static void main(String[] args) {   
        list.add('0'); 
        list.add('0');
        list.add('0');  
        tape = new Tape(list);

        s3 = new State("s2", "halt");

        t3 = new Transition(s3, '0', '1', "right");
        transitionsList3.add(t3);
        s2 = new State("s2", "NH", transitionsList3);

        t2 = new Transition(s2, '0', '1', "right");
        transitionsList2.add(t2);
        s1 = new State("s1", "NH", transitionsList2);
        
        t1 = new Transition(s1, '0', '1', "right");
        transitionsList1.add(t1);
        s0 = new State("s0", "NH", transitionsList1);

        statesList.add(s0);
        statesList.add(s1);
        statesList.add(s2);

        turingTest = new StateMachine(statesList, s0, list);
        turingTest.dealWithTape();


        /**
        //s22222
        for(int i = 0; i < 5; i++){
            list.add('2'); 
        }
        tape = new Tape(list);
        //tape: 000000: 2 transitions (1/1,R -> s6) (2/
        s0t1 = new Transition(s1, "1", "1", "R");
        s0t2 = new Transition(s6, "2", "1", "R");
        s0transitionsList.add(s0t1);
        s0transitionsList.add(s0t2);
        s0 = new State("s0", "NH", s0transitionsList);
1,R -> s1)
        //s1: 2 transitions (2/2, R -> s1) ()
        //s2:null/1, R, R  -> s2
        //s3: 1 transition (null/1,R -> s3)
        //s4: 1 transition (null/1,R -> s4)
        //s5: 2 transitions (1/1,L -> s4) (2/2,L -> s5)
        //s6: 2 transitions (2/2,L -> s5) (1/1,R -> s0) halt state
 */
        


        
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