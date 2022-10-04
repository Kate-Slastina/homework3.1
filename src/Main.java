import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int k = in.nextInt();
        int n =0;
        int i =1;
        while (m>0){
            if (m%10 != k) {
                n = n + m % 10 * i;
                i = i * 10;
            }
            m=m/10;
        }
        System.out.println(n);
    }
}