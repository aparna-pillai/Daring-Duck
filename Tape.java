import java.util.*;

public class Tape {
    private ArrayList<Integer> right = new ArrayList<Integer>(1);
    private int cur = 0;
    public ArrayList<String> input = new ArrayList<String>();
    private final static int space = 0;

    public Tape(ArrayList<Integer> input){
        right.add(space);
        for(int i = input.size() - 1; i >= 0; i--){
            right.add(i);
            //"00000001010"
        }
        cur = right.get(input.size()-1);
        input.remove(input.size()-1);
    }

    public void moveRight() {
        cur++;
        if (cur > right.size()){
           right.add(space); 
        }
        //if (right.isEmpty()) 
          //  right.add(space); 
        //cur = right.get(right.size()); 
    }

    public void moveLeft() {
        cur--;
        if (cur < 0){
            right.add(0,space);
        }
        //right.add(cur);
        //if (left.isEmpty()) 
          //  left.add(space); 
        //cur = left.get(left.size());       
    }
    
    public int read(){ 
        return cur;    
    }
    public void write(char symbol){ 
        cur = symbol;  
    }
    
    public String toString() {
        return right.toString();

    }

    //public int oneCount(){
    //}
}