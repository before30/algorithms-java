package cc.before30.algorithms.baekjoon.array;

import java.util.Scanner;

public class NumberCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] result = new int[10];
        int res = a * b * c;

        while(res > 0) {
            result[res%10]++;
            res = res/10;
        }

        for (int i=0; i<10; i++) {
            System.out.println(result[i]);
        }
    }
}
