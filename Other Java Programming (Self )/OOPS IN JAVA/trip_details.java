public class trip_details {
    public static class student_trip {
        String place;
        String journeydate;
        int tripamount;
        static int noftrips; // static variable is shared and it is of class not of the object

        public student_trip(String place, String journeydate, int tripamount) {
            this.place = place;
            this.journeydate = journeydate;
            this.tripamount = tripamount;
            noftrips++; // calculating the no of trips at each input
        }
    }

    public static void main(String[] args) {
        student_trip trip1 = new student_trip("Uttrakhand", "26july", 25000);
        System.out.println(trip1.noftrips); // calculating the no of trips at each input
        System.out.println(trip1.place); //printing the no of trips each time the input takes place
        student_trip trip2 = new student_trip("shimla", "25december", 35000);
        System.out.println(trip2.noftrips);
        System.out.println(trip2.place);
        System.out.println(trip2.tripamount);
        System.out.println(trip2.journeydate);
    }
}
