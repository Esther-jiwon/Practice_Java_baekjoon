package myself.codepractice.control.run;

import java.util.Scanner;

public class PracticeRun {
public void practice1330() {
		
		//A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
		//A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
		//A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
	    int firstNum = sc.nextInt();
	    int secondNum = sc.nextInt();
	    
	    if(firstNum < secondNum){
	        System.out.println("<");
	    } else if (firstNum == secondNum){
	        System.out.println("==");
	    } else {
	        System.out.println(">");
	    }
	}
	
	public void practice9498() {
		
		//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 
		//60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
        int score = sc.nextInt();
        
        if(score >=90){
            System.out.println("A");
        } else if(score >= 80 ){
            System.out.println("B");
        } else if(score >= 70 ){
            System.out.println("C");
        } else if(score >= 60 ){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
	}
	
	public void practice2753() {
		
		//������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̹� �⵵�� �����ϱ�? : ");
        int year = sc.nextInt();
        
        if(year % 400 == 0 && year % 4 == 0){
            System.out.println("1");
        } else if (year % 100 !=0 && year % 4 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
	}
	
	
	public void practice14681() {
		
		//���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�. 
		//��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. "Quadrant n"�� "��n��и�"�̶�� ���̴�.
		//���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. 
		//�� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.

		//���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ��ǥ(����)�� �Է��Ͻÿ� : ");
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
    
	    if(Num1 > 0 && Num2 > 0){
	        System.out.println("1");
	    } else if(Num1 < 0 && Num2 > 0){
	        System.out.println("2");
	    } else if(Num1 < 0 && Num2 < 0){
	        System.out.println("3");
	    } else {
	        System.out.println("4");
	    }
	}
	
	public void practice2884() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int H,M;
				
		H = sc.nextInt();
		M = sc.nextInt();
				
		if((M-45)<0) {
			M = (M+15);
			if((H-1) <0) {
				H = 23;
			}else {
				H = H-1;
			}
		}else {
		     M = M-45;
		}
				
		System.out.println(H + " " + M);
			
	}
}
