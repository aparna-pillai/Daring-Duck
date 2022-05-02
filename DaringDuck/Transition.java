package DaringDuck;

public class Transition {
    private String read, write, direction;
    private State to;
    
    public Transition(State to, String read, String write, String direction) {
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
    public String getRead(){
        return read;
    }

    public String getWrite(){ 
        return write; 
    }
    public State getNextState(){ 
        return to;    
    }

    public String toString() {
        return "to: " + to + ", read: " + read + ", write: " + write;
    }
}