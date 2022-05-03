package DaringDuck;

public class Transition {
    private String direction;
    private char read, write; 
    private State to;
    
    public Transition(State to, char read, char write, String direction) {
        this.to = to;
        this.read = read;
        this.write = write;
        this.direction = direction;
        //needs to know if it goes left or right
    }

    public String getDirection(){
        return direction;

        // if (direction == "right"){
        //     return "right";
        // }
        // else{
        //     return "left";
        // }
    }

    //get read and compare yourself
    public char getRead(){
        return read;
    }

    public char getWrite(){ 
        return write; 
    }
    public State getNextState(){ 
        return to;    
    }

    public String toString() {
        return "to: " + to + ", read: " + read + ", write: " + write;
    }
}