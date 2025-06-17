public class pattern_4 {
    public static void main(String[] args){
        int n=4;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
           System.out.print(val +" ");
           val+=2;
            
        }
             if(i%2==0){
               val-=1;
            }
            else{
                val-=(n+3);  //instead of 5 we can write n+3
            }
                
            System.out.println(" ");
        }
            
        }
}




