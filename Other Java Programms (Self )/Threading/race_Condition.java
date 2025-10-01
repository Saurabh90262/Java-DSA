class Counter{
    int count;
    // The key word synchronized here is used to execute only one thread at a time.
    public synchronized void increment(){
        count++;
    }
}


public class race_Condition{
    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 1;i<=1000;i++){
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 1;i<=1000;i++){
            c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
         
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


        System.out.println(c.count);
    }
} 

