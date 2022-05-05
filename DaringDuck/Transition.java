package DaringDuck;

public class Transition {
    private String direction, nameOfNextState;
    private char read, write; 
    private State to;
    
    public Transition(String nameOfNextState, char read, char write, String direction) {
        this.nameOfNextState = nameOfNextState;
        this.read = read;
        this.write = write;
        this.direction = direction;
    }

    public String getDirection(){
        return direction;
    }

    public char getRead(){
        return read;
    }

    public char getWrite(){ 
        return write; 
    }
    public String getNextState(){ 
        return nameOfNextState;    
    }

    public String toString() {
        return "to: " + to + ", read: " + read + ", write: " + write;
    }
}