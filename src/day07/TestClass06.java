package day07;

import java.util.ArrayList;

public class TestClass06 {
	public void test1(int a , String b , double c) {
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
		
	}
	public  void test2(ArrayList<String> a) {
		System.out.println(a);
		
	}
	public void test3() {
		int num =1;
		if(num ==1) {
			System.out.println("1111");
			return;
		}
		else if(num ==2) {
			System.out.println("2222");
		}
		System.out.println("다음 문장 실행 ");
	}
	public int test4() {
		int num=0;
		if(num== 0 ) {
			return 100;
		}
		else {
			return 0;
		}
	}
		public int test5() {
			
			int[] num = {100,200,300};
			return num;
		}
	}

