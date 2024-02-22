import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 현재 시간에서 45분 전으로 만들어야 해
        // 분이 45보다 크면 시간은 변하지 않지만
        // 분이 45보다 작으면 시간에 -를 해줘야 하지.
        if(min < 45) {
            hour --;
            min = 60-(45-min);

            if(hour < 0) {
                hour = 23;
            }
            System.out.println(hour+" "+min);
        } else {
            System.out.println(hour+ " "+(min-45));
        }
    }
}