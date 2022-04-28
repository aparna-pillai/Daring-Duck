public class State {
    private String name;
    private String type;

    public State(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public boolean halt(){ 
        return type.equals("H"); 
    }
    public boolean left(){ 
        return type.equals("L"); 
    }
    public boolean right(){ 
        return type.equals("R"); 
    }
    public boolean accept(){ 
        return type.equals("Y"); 
    }
    public boolean reject(){ 
        return type.equals("N"); 
    }
    
    public String getName(){ 
        return name; 
    }
   public String toString() {
       return name + " " + type;
   } 
}

/*
Each state has a name and a type (halt, left, right, accept, or reject).
*/