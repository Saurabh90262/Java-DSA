public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        // another way to set the color
        p1.color = "Golden";
        System.out.println(p1.color);
    }
}

class Pen { // created a pen class
    // prop + functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }
}