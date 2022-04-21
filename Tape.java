import java.util.*;

public class Tape {
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