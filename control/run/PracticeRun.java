package myself.codepractice.control.run;

import java.util.Scanner;

public class PracticeRun {
public void practice1330() {
		
		//A가 B보다 큰 경우에는 '>'를 출력한다.
		//A가 B보다 작은 경우에는 '<'를 출력한다.
		//A와 B가 같은 경우에는 '=='를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하시오 : ");
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
		
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 
		//60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시험 점수를 입력하세요 : ");
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
		
		//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이번 년도는 윤년일까? : ");
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
		
		//흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
		//사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
		//예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
		//점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

		//점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 좌표(정수)를 입력하시오 : ");
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
			
		System.out.print("현재 시간을 입력하세요 : ");
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
