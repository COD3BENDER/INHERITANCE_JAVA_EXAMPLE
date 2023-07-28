public class Parent1 {

    private String name; // variable declared but not initialized
    private int age; // variable declared but not initialized
    private String gender; // variable declared but not initialized

    public Parent1(String name, int age, String gender){ // you see here you added these arguments
        this.name = name; // and initialize the variables that you declared above to the argument values
        this.age = age; // and initialize the variables that you declared above to the argument values
        this.gender = gender; // and initialize the variables that you declared above to the argument values
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
