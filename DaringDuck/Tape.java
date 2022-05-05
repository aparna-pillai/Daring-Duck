package DaringDuck;

import java.util.*;

public class Tape {
    private ArrayList<Character> tapeSymbols = new ArrayList<Character>(1);
    private int cur = 1;
    public ArrayList<Character> input = new ArrayList<Character>();
    private final static char space = '#';
    private final static char filler = 'N';

    public Tape(ArrayList<Character> input){
        tapeSymbols.add(space);
        for (int i = 0; i < input.size(); i++){
            tapeSymbols.add(input.get(i));
        }
    }

    public void moveRight() {
        cur = cur+1;
        if (cur == tapeSymbols.size()){
           tapeSymbols.add(filler); 
        }
    }

    public void moveLeft() {
        cur = cur-1;
        if (cur <= 0){
            tapeSymbols.add(0,filler);
        }      
    }
    
    public char read(){ 
        return tapeSymbols.get(cur);    
    }

    public void write(char symbol){ 
        tapeSymbols.set(cur, symbol);  
    }
    
    public String toString() {
        return tapeSymbols.toString();
    }

    public int oneCount(){
        int count = 0;
        for (int x = 0; x < tapeSymbols.size(); x++){
            if (tapeSymbols.get(x) == '1'){
                count++;
            }
        }
        return count;
    }
}