package io;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            // hasNextInt = 정지 -> 사용자가 입력한 값에 엔터가 있다면
            // 중지된 자바를 재생 시키고
            // 만약 사용자가 입력한 값이 정수라면 true를 리턴하고, 정수가 아니라면 false 리턴
            System.out.println(sc.nextInt()*1000);
        }

        sc.close();
    }
}

