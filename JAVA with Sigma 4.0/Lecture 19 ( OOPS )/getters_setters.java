public class getters_setters {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // another way to set the color
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip; // this.tip refers to the object calling tip , which is declared as variable in
                        // the class;
        // tip refers to the new tip which is to be set as new tip.
    }
}
