package day07;

import java.util.Scanner;

public class TestClass07 {
	
public int test(int[] a) {
	
	int sum =0;
	sum =a[0] + a[1];
	return sum;
}
public void printnum(int[] a, int sum) {
	System.out.println(a[0]+"+"+a[1]+"="+sum);
}
public int[] inputnum() {
	Scanner sc = new Scanner(System.in);
	int num=0, num2 =0;
	System.out.println("수 입력");
	num = sc.nextInt();
	num2 = sc.nextInt();
	int[] arr = {num,num2};
	return arr;
}
}
