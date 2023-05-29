package day07;

import java.util.Scanner;

public class MainClass07 {
public static void main(String[] args) {
	TestClass07 t = new TestClass07();
int[] a=t.inputnum();
	int s= t.test(a);
	t.printnum(a,s);
}
}
