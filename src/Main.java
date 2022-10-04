import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =1_000_000;
        for(int i =0;i < 10;++i){
            int k = in.nextInt();
            if ((k < n) && (k >0)){
                n=k;
            }
        }
        System.out.println(n);
    }
}