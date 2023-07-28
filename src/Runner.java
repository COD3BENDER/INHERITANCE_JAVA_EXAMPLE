public class Runner {

    public static void main(String[] args) {
        // In these two examples, the difference is when you initially create an object. the child classes only have a
        // location variable everything else is inherited.

        // when we create child1, we need to pass in the data into the () when we create the object because we specified arguments for it.
        Child1 child1 = new Child1("Location");

        child1.setName("Child1name");
        System.out.println("Child 1 Name: "+child1.getName());
        child1.setAge(100);
        System.out.println("Child 1 Age: "+child1.getAge());
        child1.setGender("Gender1");
        System.out.println("Child 1 Age: "+child1.getGender());


        // whereas here we don't need to add any data into the object when we create it.
        Child2 child2 = new Child2(); // whereas here we can create the object without having to pass in variables.

        child2.setName("Child2name");
        System.out.println("Child 2 Age: "+child2.getName());

        child2.setAge(120);
        System.out.println("Child 2 Age: "+child2.getAge());

        child2.setGender("Gender2");
        System.out.println("Child 2 Age: "+child2.getGender());

    }
}
