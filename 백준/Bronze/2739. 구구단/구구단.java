import java.util.Scanner;


public class Main {
    

public static void main(String[] args) {

		// n 을 입력받은뒤 구구단 n단을 출력하는 프로그램을 작성하시오
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
			for(int j=1; j<10; j++) {
				System.out.println(n + " * " + j + " = " + n*j);
				
			}

		
	}
}