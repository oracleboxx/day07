package day07;

import java.util.Scanner;

public class Mainclass05 {
public static void main(String[] args) {
	int n; // 첫번째 문자가 소문자이면 변수 대문자이면 객체
	TestClass05 t = new TestClass05();
	
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("입력 받을 수");
	num = sc.nextInt();
	//인자값 또는 parameta
	t.sumFunc(num);
	System.out.println("sumfunc2");
	int s = t.sumFunc2(num);
	System.out.println("1~"+num+"까지의 합:"+s);
}
}
