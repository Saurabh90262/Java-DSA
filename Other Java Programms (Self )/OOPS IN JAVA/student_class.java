public class student_class {
    public static void func(Student s1){
        System.out.println(s1.percentage);
    }
    public static class Student{
        String name;
        double percentage;
        int roll;    
    }
    public static void main(String[] args) {
        Student s1=new Student(); //declaration
        s1.name="Saurabh";
        s1.percentage=88.5;
        s1.roll=223;
        System.out.println(s1.name);
        func(s1);
    }
}
