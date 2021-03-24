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
	
	//practice1 ~ practice7 예제풀이
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = null;
		switch(num) {
		case 1 : result = "입력"; break;
		case 2 : result = "수정"; break;
		case 3 : result = "조회"; break;
		case 4 : result = "삭제"; break;
		case 7 : result = "종료"; break;
		default : result = "없는";
		}
		
		System.out.println(result + " 메뉴입니다.");
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			if(num%2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int language = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		
		int total = language + math + english;
		double average = total/3.0;
		
		if(language >= 40 && math >= 40 && english >= 40 && average >= 60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!",
					language, math, english, total, average);
		} else {
			System.out.printf("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result = "";
		switch(month) {
		case 2 : result = month + "월은 28일까지 있습니다."; break;
		case 1 : case 3 :case 5 :case 7 :case 8 :case 10 :case 12 : result = month + "월은 31일까지 있습니다."; break;
		case 4 :case 6:case 9 :case 11 : result = month + "월은 30일까지 있습니다."; break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다."); 
		}
		
		System.out.println(result);
		
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result = null;
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30){
			result = "비만";
		} else {
			result = "고도비만";
		}
		
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);	
		
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int last = sc.nextInt();
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		System.out.print("출석 회수 : ");
		double present = sc.nextDouble();
		
		double midScore = mid * 0.2;
		double finalScore = last * 0.3;
		double taskScore = task * 0.3;
		double total = midScore + finalScore + taskScore + present;
		
		System.out.println("================= 결과 =================");
		if(present > 14) {
			if(total >= 70) {
				System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수 (30) : %.1f\n"
						+ "출석 점수(20) : %.1f\n총점 : %.1f\n",
						midScore, finalScore, taskScore, present, total);
				System.out.println("PASS");
			} else {
				System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수 (30) : %.1f\n"
						+ "출석 점수(20) : %.1f\n총점 : %.1f\n",
						midScore, finalScore, taskScore, present, total);
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.println("Fail [출석 회수 부족 (" + (int)present + "/20)]");
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("연산자 입력(+,-,*,/,%) : "); // + - * / %
		char op = sc.next().charAt(0);
		

		if(input1 > 0) {
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {
				
						System.out.print("피연산자 2 입력 : ");
						double input2 = sc.nextDouble();	
						double result = 0;
				
						if(input2 < 0) {
							System.out.println("양수를 입력해주세요.");
						} else {
							switch(op) {
							case '+' : result = input1 + input2; break;
							case '-' : result = input1 - input2; break;
							case '*' : result = input1 * input2; break;
							case '/' : result = input1 / input2; break;
							case '%' : result = input1 % input2; break;			
							}
							System.out.printf("%.0f %s %.0f = %f"						
								, input1, op, input2, result);
						}
			} else {
						System.out.println("잘못 입력하셨습니다.");
			}
		} else if (input1 == 0){
			if(op == '/' || op == '%'){
				System.out.println("0은 나눌 수 없습니다.");
			}	 
		} else {
			System.out.println("양수를 입력해주세요.");
		}
		
	}
	
	
	
	
		
	
}

