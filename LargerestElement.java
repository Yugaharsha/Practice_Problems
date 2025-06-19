public class LargerestElement{
    public static void main(String[] args) {
        int[] arr = {13,32,83,24,45};
       
        int result = findLargerElement(arr);
        System.out.println("The larger element is: " + result);
    }
    public static int findLargerElement(int[] arr){
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>result){
                result = arr[i];
            }
        }
        return result;
    }
}
