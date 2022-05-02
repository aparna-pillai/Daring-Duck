package DaringDuck;

import java.util.*;

public class Tape {
    private ArrayList<String> tapeSymbols = new ArrayList<String>(1);
    private int cur = 0;
    public ArrayList<String> input = new ArrayList<String>();
    private final static String filler = "null";

    public Tape(ArrayList<String> input){
        tapeSymbols.add(filler);
        for(int i = 0; i < input.size(); i++){
            tapeSymbols.add(input.get(i));
        }
        cur = 0;
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
        if (cur == tapeSymbols.size()){
           tapeSymbols.add(filler); 
        }
        //if (right.isEmpty()) 
          //  right.add(space); 
        //cur = right.get(right.size()); 
    }

    public void moveLeft() {
        cur = cur-1;
        if (cur < 0){
            tapeSymbols.add(0,filler);
        }
        //right.add(cur);
        //if (left.isEmpty()) 
          //  left.add(space); 
        //cur = left.get(left.size());       
    }
    
    public String read(){ 
        return tapeSymbols.get(cur);    
    }

    public void write(String symbol){ 
        tapeSymbols.set(cur, symbol);  
    }
    
    public String toString() {
        return tapeSymbols.toString();

    }

    //public int oneCount(){
    //}
}