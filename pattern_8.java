public class pattern_8 {
	public static void main(String[] args) {
		  // Output: 
        // 1
        // 6       2
        // 10      7       3
        // 13      11      8       4
        // 15      14      12      9       5

         
         int n = 5;
         int val = 1;
         
         for(int i = 1; i <= n; i++){
             int s = val;
             int a = n+1 - i;
             for(int j = 1 ; j<=i ; j++){
                 System.out.print(s+" ");
                 s -= a++;
             }
             val+= n - i + 1;
             
             System.out.println();
         }
	}
}
    

