import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cook = sc.nextInt();
        
        // 모두 분으로 바꿔 계산
        int total = h * 60 + m + cook;
        int hour = (total/60) % 24;
        int min = total % 60;
        
        System.out.println(hour+" "+min);
        sc.close();

    }
}