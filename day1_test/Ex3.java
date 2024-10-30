package test;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키보드를 입력하세요.");
		String i = sc.next();
		//System.out.println(i);
		int a = (int)i.length();
		for (int b=0; b<a;b++) {
			char name = i.charAt(b);
			
			if ((name >= 'A' && name <= 'Z') || (name >= 'a' && name <= 'z')) {
                System.out.println(name + ": 알파벳");
            } else if (name >= '0' && name <= '9') {
                System.out.println(name + ": 숫자");
            } else {
                System.out.println(name + ": 해당없음");
            }
        }
	
	}
}
/*
3.Ex3.java 문제
키보드 입력 
AbCgfhgf2321*&(엔터)

A:알파벳
b:알파벳
...
2:숫자
..
&:해당없음
*/