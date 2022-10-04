import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] bruh = new int[10];
        int n =1_000_000;
        for (int i =0;i< bruh.length;++i){
            int k = in.nextInt();
            bruh[i]=k;
            if (bruh[i]>n){
                System.out.println(bruh[i]);
            }
            n=bruh[i];
        }
    }
}