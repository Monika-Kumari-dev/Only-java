public class SecondLargestElement {
    public static int secLargest(int [] arr){
        if(arr.length<2) return -1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num: arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return (secondLargest == Integer.MIN_VALUE)? -1:secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,5,7};
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Second Largest Number"+" "+secLargest(arr));
    }
}
