package Practice.WhatIsJava;

import java.util.ArrayList;
import java.util.Scanner;

public class WhatIsArrayList {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>(3);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            a.add(scanner.next());           //입력한 문자열을 이스트에 삽입함
            System.out.println(a.get(i));    //입력한 순서대로 출력
        }
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(max).length() < a.get(i).length()) {
                max = i;
            }
        }
        System.out.println("제일 긴 문자열 " + a.get(max));
    }
}
