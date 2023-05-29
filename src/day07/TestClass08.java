package day07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TestClass08 {
	public ArrayList<Integer> test() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr =new ArrayList<>();
		int inputnum=0, 	inputnum2=0;
		System.out.println("숫자 입력");
		 inputnum = sc.nextInt();
		
		 inputnum2 =sc.nextInt();
		arr.add(inputnum);
		arr.add(inputnum2);
		
		return arr;
	}
	public int test2(ArrayList<Integer> i) {
		int sum =0;
		sum = i.get(0)+i.get(1);
		return sum;
		
			
		}
	public void test3(ArrayList<Integer> i , int total) {
		System.out.println(i.get(0)+"+"+i.get(1)+"="+total);
	}
	}

	//public String test2() {
		//System.out.println();
	

