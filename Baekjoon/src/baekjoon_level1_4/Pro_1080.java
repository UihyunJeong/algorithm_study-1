package baekjoon_level1_4;

import java.util.Scanner;

public class Pro_1080 {
	public void mul(double a, double b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		
		double a = Double.parseDouble(line[0]);
		double b = Double.parseDouble(line[1]);
		
		Pro_1080 pro = new Pro_1080();
		pro.mul(a, b);
	}
	
	///float : �޸� ũ�� 4byte(32bit) / ǥ������ �Ҽ��� ���� �ڸ��� : 6
	///double : �޸� ũ�� 8byte(64bit) / ǥ������ �Ҽ��� ���� �ڸ��� : 15
	///long double : �޸� ũ�� 8byte(64bit) / ǥ������ �Ҽ��� ���� �ڸ��� : 15�̻�
}
