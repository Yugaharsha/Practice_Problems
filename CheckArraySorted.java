public class CheckArraySorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 5};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                
            }
            else{
                return false;
            }
        }
        return true;    
    }

}