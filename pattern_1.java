public class pattern_1 {
    public static void main(String[] args) {
        int n=3;
        int start = n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(start--+" ");
            }
            System.out.println();
        }
    }
    
}
