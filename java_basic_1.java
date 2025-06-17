import java.util.*;

class java_basic_1 {
    public void printNumber(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java_basic_1 obj = new java_basic_1();
        obj.printNumber(sc);
    }
}
