public class function_Overloading_using_Data_types {
    // Function overloading using Data Types

    // function to calculate int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.5f, 5.5f));
    }
}
