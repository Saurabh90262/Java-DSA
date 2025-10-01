public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student(null); // calls the unparametrised constructor
        Student s2 = new Student("Saurabh"); // calling the constructor to create a new object.Calls the parametrised
                                             // constructor with String parameter
        System.out.println(s2.name);
        Student s3 = new Student(11022); // call int parameterised constructor

        Student s4 = new Student("Saurabh", 758);

        
        Car c1 = new Car();
        Car c2 = new Car();
    }
}

class Student {
    String name;
    int roll;

    // this is a parametrised constructor
    Student(String name) { // this is a constructor, even if we not made it then java itself make a default
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

class Car {
    String brand;
    int price;

    // this is a non parametrised constructor
    Car() {
        System.out.println("Constructor for Car is called...");
    }
}
