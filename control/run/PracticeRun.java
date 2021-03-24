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
	
	//practice1 ~ practice7 ����Ǯ��
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n7. ����\n�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = null;
		switch(num) {
		case 1 : result = "�Է�"; break;
		case 2 : result = "����"; break;
		case 3 : result = "��ȸ"; break;
		case 4 : result = "����"; break;
		case 7 : result = "����"; break;
		default : result = "����";
		}
		
		System.out.println(result + " �޴��Դϴ�.");
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			if(num%2 == 0) {
				System.out.println("¦���Դϴ�.");
			}else {
				System.out.println("Ȧ���Դϴ�.");
			}
		} else {
			System.out.println("����� �Է����ּ���");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int language = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int english = sc.nextInt();
		
		int total = language + math + english;
		double average = total/3.0;
		
		if(language >= 40 && math >= 40 && english >= 40 && average >= 60) {
			System.out.printf("���� : %d\n���� : %d\n���� : %d\n�հ� : %d\n��� : %.1f\n�����մϴ�, �հ��Դϴ�!",
					language, math, english, total, average);
		} else {
			System.out.printf("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		String result = "";
		switch(month) {
		case 2 : result = month + "���� 28�ϱ��� �ֽ��ϴ�."; break;
		case 1 : case 3 :case 5 :case 7 :case 8 :case 10 :case 12 : result = month + "���� 31�ϱ��� �ֽ��ϴ�."; break;
		case 4 :case 6:case 9 :case 11 : result = month + "���� 30�ϱ��� �ֽ��ϴ�."; break;
		default : System.out.println(month + "���� �߸� �Էµ� ���Դϴ�."); 
		}
		
		System.out.println(result);
		
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result = null;
		
		if(bmi < 18.5) {
			result = "��ü��";
		} else if(bmi < 23) {
			result = "����ü��";
		} else if(bmi < 25) {
			result = "��ü��";
		} else if(bmi < 30){
			result = "��";
		} else {
			result = "����";
		}
		
		
		System.out.println("BMI ���� : " + bmi);
		System.out.println(result);	
		
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int last = sc.nextInt();
		System.out.print("���� ���� : ");
		int task = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		double present = sc.nextDouble();
		
		double midScore = mid * 0.2;
		double finalScore = last * 0.3;
		double taskScore = task * 0.3;
		double total = midScore + finalScore + taskScore + present;
		
		System.out.println("================= ��� =================");
		if(present > 14) {
			if(total >= 70) {
				System.out.printf("�߰� ��� ����(20) : %.1f\n�⸻ ��� ����(30) : %.1f\n���� ���� (30) : %.1f\n"
						+ "�⼮ ����(20) : %.1f\n���� : %.1f\n",
						midScore, finalScore, taskScore, present, total);
				System.out.println("PASS");
			} else {
				System.out.printf("�߰� ��� ����(20) : %.1f\n�⸻ ��� ����(30) : %.1f\n���� ���� (30) : %.1f\n"
						+ "�⼮ ����(20) : %.1f\n���� : %.1f\n",
						midScore, finalScore, taskScore, present, total);
				System.out.println("Fail [���� �̴�]");
			}
		} else {
			System.out.println("Fail [�⼮ ȸ�� ���� (" + (int)present + "/20)]");
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		double input1 = sc.nextDouble();
		
		System.out.print("������ �Է�(+,-,*,/,%) : "); // + - * / %
		char op = sc.next().charAt(0);
		

		if(input1 > 0) {
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {
				
						System.out.print("�ǿ����� 2 �Է� : ");
						double input2 = sc.nextDouble();	
						double result = 0;
				
						if(input2 < 0) {
							System.out.println("����� �Է����ּ���.");
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
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} else if (input1 == 0){
			if(op == '/' || op == '%'){
				System.out.println("0�� ���� �� �����ϴ�.");
			}	 
		} else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}
	
	
	
	
		
	
}

