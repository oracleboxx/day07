package day07;

import java.util.ArrayList;

public class MainClass06 {
public static void main(String[] args) {
	TestClass06 t = new TestClass06();
	t.test1(10,"안녕",1.1);
	ArrayList<String> arr =new ArrayList<>();
	arr.add("안녕");
	arr.add("하세요");
	t.test2(arr);
	t.test3();
	int s =t.test4();
	System.out.println(s);
	t.test5();
}
}
