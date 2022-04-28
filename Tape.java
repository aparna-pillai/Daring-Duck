import java.util.*;

public class Tape {

    private ArrayList<Character> current = new ArrayList<Character>(1);
    private ArrayList<Character> right = new ArrayList<Character>(1);
    private ArrayList<Character> left = new ArrayList<Character>(1);
    private char cur;
    public ArrayList<String> input = new ArrayList<String>();
    private final static char Blank = '#';

    public Tape(ArrayList<String> input){
        right.add(Blank);
        for(int i = input.size() - 1; i >= 0; i--){
            right.add((Character) input.get(i));
        }
        cur = right.get(input.size()-1);
        input.remove(input.size()-1);
    }
    public void moveLeft() {
        right.add(cur);
        if (left.isEmpty()) 
            left.add(Blank); // increase size of tape if necessary
        cur = left.get(left.size());       
    }
    
    // move tape head right one position
    public void moveRight() {
        left.add(cur);
        if (right.isEmpty()) 
            right.add(Blank); // increase size of tape if necessary
        cur = right.get(right.size()); 
    }
    
    // set and get the symbol stored in the active cell
    public char read(){ 
        return cur;    
    }
    public void write(char symbol){ 
        cur = symbol;  
    }
    

    // return a reversed version of the string s
    public static String reverse(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String left = s.substring(0, N/2);
        String right = s.substring(N/2, N);
        return reverse(right) + reverse(left);
    }
  
    // show representation of tape
    public String toString() {
        return reverse(left.toString()) + "|" + current + "|" + right;
=======
    private ArrayList<String> right = new ArrayList<>();
    private ArrayList<String> left = new ArrayList<>();
    private String marker = "#";
    private char arrow;

    public Tape(ArrayList<String> input){
        right.add(marker);
        for (int i = input.size()-1; i>=0; i--) {
            right.add(input.get(i));
        }
        arrow = right.remove(input.get(0));
    }

    public String toString(){
        return input;
    }

    public int oneCount(){


    }
}



/* 



java is an ADT that represents an unbounded Turing machine tape. 
It supports the following operations: 
move tape head left, move tape head right, 
read the symbol in the current cell, 
and write a symbol to the current cell. 
To implement it, we use two stacks 
(one to store all of the symbols to the left of the tape head, 
and one to the right). 
To print out the contents of the tape, 
we print out the reverse of the first stack, the current element, 
then the second stack.

*/