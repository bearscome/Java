package io;

import java.util.Scanner;
// 라이브러리 임포트

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.in = 사용자가 입력 한 값
        int i = sc.nextInt();
        // sc.nextInt() = 프로그램이 멈춤
        // 엔터(공백)를 입력 시 자바가 실행되면서 사용자가 입력한 값이 i에 할당 된다.

        System.out.println(i*1000);
        sc.close();
    }
}
