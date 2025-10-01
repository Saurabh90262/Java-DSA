public class car_details {
    // this is a function
    public static void cardata(CarDetails car1){
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.Price);

    }
    // this is oops (creation oc classes using oops)
    public static class CarDetails{
        String brand;
        String model;
        int Price;
        String type;
    }
    public static void main(String[] args) {
        CarDetails car1=new CarDetails();
        CarDetails car2=new CarDetails();
        car1.brand="Tata";
        car1.model="Harrier";
        car1.Price=1700000;
        car1.type="SUV";
        // car2.brand="Mahindra";
        // car2.model="XUV 700";
        // car2.Price=1800000;
        // car2.type="SUV";
        System.out.println(car2.brand); //returns a null value if the object is empty.

        cardata(car1);
    }
}
