public class addTwo2Darray {
    public static void divideArray(int[] arr){
        int []res = new int[5];
        for(int i =0;i<arr.length;i++){
            res[i] = arr[i]/2;
        }
        for(int j = 0;j<res.length;j++){
            System.out.println(res[j]);
        }
    }
    public static void sum2D_Array(int[][] arr1,int[][] arr2){
        int [][]arr = new int[2][3];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6}};
        int[][] arr2 = {{8,9,10},{11,12,13}};
        sum2D_Array(arr1, arr2);
        int[] arr3 = {2,4,5,13};
        divideArray(arr3); 
    }
}
