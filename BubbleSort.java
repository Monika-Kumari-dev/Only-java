public class BubbleSort{
    public static void main(String[] args) {
        int [] arr = {1,3,2,9,5,2};
        int n = arr.length;
        for(int ele:arr){
            System.out.print(ele);
        }
        System.out.println();

    for(int i = 0; i<n-1;i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = temp;
        }
        
    }
    for(int ele:arr){
        System.err.print(ele);
    }
    }
}
