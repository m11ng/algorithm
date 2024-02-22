import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = 1;
        int count = 0;
        int size2 = 0;

        while(size < k) {
            size = size * 2;
            size2 = size;
        }

        while(k > 0) {
            if(k>=size){
                k-=size;
            }
            else {
                size /= 2;
                count++;
            }
        }

        System.out.println(size2+" "+count);

    }
}