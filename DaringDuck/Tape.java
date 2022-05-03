package DaringDuck;

import java.util.*;

public class Tape {
    private ArrayList<Character> tapeSymbols = new ArrayList<Character>(1);
    private int cur = 0;
    public ArrayList<Character> input = new ArrayList<Character>();
    private final static char filler = 'N';

    public Tape(ArrayList<Character> input){
        this.input = input;
    }

    /** public Tape(ArrayList<Integer> input){
        right.add(space);
        for(int i = input.size() - 1; i >= 0; i--){
            right.add(i);
            //"00000001010"
        }
        cur = right.get(input.size()-1);
        input.remove(input.size()-1);
    }
    */

    public void moveRight() {
        cur = cur+1;
        if (cur == input.size()){
           input.add(filler); 
        }
        //if (right.isEmpty()) 
          //  right.add(space); 
        //cur = right.get(right.size()); 
    }

    public void moveLeft() {
        cur = cur-1;
        if (cur < 0){
            input.add(0,filler);
        }
        //right.add(cur);
        //if (left.isEmpty()) 
          //  left.add(space); 
        //cur = left.get(left.size());       
    }
    
    public char read(){ 
        return input.get(cur);    
    }

    public void write(char symbol){ 
        input.set(cur, symbol);  
    }
    
    public String toString() {
        return input.toString();
    }

    //public int oneCount(){
    //}
}