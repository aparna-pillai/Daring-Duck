public class Tape {
    
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