// public class A extends Thread{
//     @Override
//     // run method is override method so it cannnot handle exception through throws keyword it can done through try and catch block
//     public void run(){
//         try{
//         for(int i=1;i<=5;i++){
//             System.out.println("Shukla");
//             Thread.sleep(1000);
//         }
//     }
//     catch(InterruptedException e){
//         System.out.println("Interrupted Exception occurr");
//     }
//     }


    
// }
// public class multithreading {
//     public static void main(String[] args) throws InterruptedException {
//         A t=new A();
//         t.start();// thread ko start krta hai run method ko bhi call krta hai
//         for(int i=1;i<=5;i++){
//             System.out.println("Satyam");// pahle main thread ki value aayegi fir thread kyoki execute hone me time lgta ye differ kr shkta hai
//              Thread.sleep(1000);
//         }
       
//     }
// }




// CREATION OF THREAD
// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<=5;i++){
//             System.out.println("My child Thread");
//         }
//     }
// }
// public class multithreading{
//     public static void main(String[] args) {
//         A r=new A();
//         Thread t=new Thread(r);
//         t.start();
//          for(int i=0;i<=5;i++){
//             System.out.println("My main Thread");
//         }
//     }
// }




// THREAD SCHEDULER
class A extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
public class multithreading{
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.start();
          t2.start();
            t3.start();
        
    }
} {
    
}
