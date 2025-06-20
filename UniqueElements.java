public class UniqueElements {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 5, 5, 6, 7, 8, 8};
        System.out.println(removeDuplicates(arr));
    }
   public static int removeDuplicates(int[] arr){
     int i=0;
     for(int j=1; j<arr.length; j++){
         if(arr[j]!=arr[i]){
             arr[i+1]=arr[j];
             i++;
         }
     }
     return i+1; // Return the count of unique elements
   }
}
