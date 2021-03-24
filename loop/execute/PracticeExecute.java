package myself.codepractice.loop.execute;

import java.util.Scanner;

public class PracticeExecute {

	public void example10950() {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int list[] = new int[T];
		
		for(int i = 0 ; i < T ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = (A + B);
			list[i] = sum;
		} 
		
		for(int j  = 0 ; j < T; j++) {
			System.out.println(list[j]);
		}
		
		// 하.. 진짜 어려웠다.
		
		
		
		String a = sc.next();
		
		sc.nextLine(); // 버퍼에서 엔터를 꺼내오기만 하는 용도
		
		String b = sc.nextLine();
	}
	
	public void example8393() {
		//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        
        for( int i = 1 ; i <= n ; i++){
            result += i;
        }
        
        System.out.println(result);
	}
}





