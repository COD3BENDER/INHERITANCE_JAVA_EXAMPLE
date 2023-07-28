public class Child1 extends Parent1 { // the extends is the fundamental part of inheritance, its what dictates if a class is inherited

    private String location;

    public Child1(String location){ // we also added an argument here in the child class.
        super("name",100,"Gender"); // because you added arguments you have to add these values in to the super constructor
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
