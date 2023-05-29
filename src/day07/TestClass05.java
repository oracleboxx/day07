package day07;

import java.util.Scanner;

public class TestClass05 {
	public void sumFunc(int num) {
	
	int sum =0;
	for(int i =0 ; i<=num; i++) {
		sum+=i;
	}
	System.out.println("1~"+num+"까지의 합:"+sum);
	}
	public int  sumFunc2(int num) {
		
		int sum =0;
		for(int i =0 ; i<=num; i++) {
			sum+=i;
		}
		//메소드를 종료하는 기능
		// return 다음에 값이 있으면 , 값을 돌려주는 기능
		return sum;
		
	}
}
