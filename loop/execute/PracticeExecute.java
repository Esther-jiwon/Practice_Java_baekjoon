package myself.codepractice.loop.execute;

import java.util.Scanner;

public class PracticeExecute {

	public void example10950() {
		//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		
		// ��.. ��¥ �������.
		
		
		
		String a = sc.next();
		
		sc.nextLine(); // ���ۿ��� ���͸� �������⸸ �ϴ� �뵵
		
		String b = sc.nextLine();
	}
	
	public void example8393() {
		//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        
        for( int i = 1 ; i <= n ; i++){
            result += i;
        }
        
        System.out.println(result);
	}
}





