package com.gitTest;

import java.util.Scanner;

public class ��������Ŭ���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		System.out.println(name + " ����� ��û�� �Դϴ�^^");

		System.out.println(name + " ����� �˸�û�� �Դϴ�^^");

		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.println("������ �Է��ϼ��� : ");
		String gender = sc.next();
		
		System.out.println("��е� �Է��ϼ��� : ");
		String temp = sc.next();
		
		System.out.println("���� ������ ����� : ");
		String umm = sc.next();
		
		System.out.println("��ȣ�� ������ �質��?");
		String ox = sc.next();
		if(ox.equals("��")) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("���ϰ� �־��");
		}
		
		
		
	}

}
