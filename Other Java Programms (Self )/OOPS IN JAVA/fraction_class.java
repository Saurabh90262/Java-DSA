public class fraction_class {
    // function to calculate the sum of two fracions
    public static Fraction add(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.den+f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator,denominator);
        return f3;
    }
    public static Fraction multiply(Fraction f1,Fraction f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f4 = new Fraction(numerator,denominator);
        return f4;
    }
    // Method to calculate GCD
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) {
                return i; // Return GCD
            }
        }
        return 1; // Default if no GCD > 1 is found
    }

    // Inner Fraction class
    public static class Fraction {
        int num;
        int den;

        // Constructor
        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify(); // simplifying directly
        }

        // Simplify method
        public void simplify() {
            int hcf = gcd(this.num, this.den); // Use the gcd method
            this.num /= hcf; // Simplify numerator
            this.den /= hcf; // Simplify denominator
        }
    }

    // Main method
    public static void main(String[] args) {
        Fraction f1 = new Fraction(35, 21);
        System.out.println(f1.num + "/" + f1.den); // Before simplification
        //f1.simplify(); // Simplify the fraction
        //System.out.println(f1.num + "/" + f1.den); // After simplification
        Fraction f2 = new Fraction(7, 3);
        System.out.println(f2.num + "/" + f2.den);
        Fraction f3 = add(f1,f2);
        System.out.println(f3.num + "/" + f3.den);
        Fraction f4 = multiply(f1,f2);
        System.out.println(f4.num + "/" + f4.den);
    }
}
