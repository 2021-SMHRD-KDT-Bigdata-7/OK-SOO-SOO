package com.gitTest;

import java.util.Scanner;

public class 기현이의클래스 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.println(name + " 당신은 멍청이 입니다^^");
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
	}

}
