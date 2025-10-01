import java.util.*;

class Student {
    int roll;
    String name;
    int age;
}

public class studentName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = sc.nextLine();
        s1.roll = 11;
        s1.age = sc.nextInt();
        s2.name = "Rohit";
        s2.age = 15;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s1.age);
        sc.close();
    }
}
