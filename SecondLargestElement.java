/* //bruttu code
public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 88, 88};
        int res = FindSecondLargest(arr);
        System.out.println(res);
    }

    public static int FindSecondLargest(int[] arr) {
        int SecondLargest = -1;  // initialized to default value
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {  // fixed loop condition
            if (arr[i] != arr[n - 1]) {
                SecondLargest = arr[i];
                break;
            }
        }
        return SecondLargest;
    }
}
*/
/* better code 
public class SecondLargestElement{
    public static void main(String[] args){
        int[] arr = {13, 32, 83, 24, 45};
        int res = findLargest(arr);
        int result = findSecondLargestElement(arr, res);
        System.out.println("The second largest element is: " + result);
    }
   public static int findLargest(int[] arr){
    int largest = arr[0];
    for(int i=1;i<arr.length;i++){
         if(arr[i]>largest){
            largest= arr[i];
         }
    }
    return largest;
}
    public static int findSecondLargestElement(int[] arr,int res){
        int slargest =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>slargest && arr[i]!=res){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}
*/
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {13, 32, 83, 24, 45};
        int result = findSecondLargestElement(arr);
        System.out.println("The second largest element is: " + result);
    }


    public static int findSecondLargestElement(int[] arr) {
        int slargest = -1;
        int largest= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i] > slargest ){
                slargest = arr[i];

            }
        }
        return slargest;
    }
}
