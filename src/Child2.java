public class Child2 extends Parent2 { // the extends is the fundamental part of inheritance, its what dictates if a class is inherited
    String location;

    public Child2(){ // in this example, we didn't add any arguments we will update variables later. we initialized it with defaults
        super(); // we put in the super constructor here without any arguments.
        this.location = "";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
