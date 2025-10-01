import java.util.*;
public class array_list {
    public static class Arraylist{
        int[] arr = new int [5];
        int indx=0;
        int size=0;
        public void add(int ele){
            if(size==arr.length){
                int[] brr=Arrays.copyOf(arr,arr.length*2);
                // arr= new int[brr.length];
                // arr = Arrays.copyOf(brr,brr.length);
                arr=brr;
            }
            arr[indx]=ele;
            indx++;
            size++;
        }
        public void set(int indx,int val){
            arr[indx]=val;
        }
    }
 
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(0,10);
    }
}
