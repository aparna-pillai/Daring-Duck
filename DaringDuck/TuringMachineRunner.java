package DaringDuck;

import java.util.*;


public class TuringMachineRunner{
    static ArrayList<String> list = new ArrayList<String>();
    static Tape tape;
    static ArrayList<Transition> transitionsList1, transitionsList2;
    static State s0, s1;
    static Transition t1, t2, t3;

    public static void main(String[] args) {   
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
        

        
         


    }
}