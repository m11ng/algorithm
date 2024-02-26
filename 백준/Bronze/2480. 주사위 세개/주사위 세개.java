import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int money = 0;

        if(first == second && first == third && second == third){
            money = 10000 + (first*1000);
        } else if (first == second || first == third) {
            money = 1000 + (first*100);
        } else if (second == third) {
            money = 1000 + (second*100);
        } else {
            money = Math.max(first, Math.max(second, third)) * 100;
        }

        System.out.println(money);
        sc.close();

    }
}