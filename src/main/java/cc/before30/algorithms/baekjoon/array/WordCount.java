package cc.before30.algorithms.baekjoon.array;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuffer buffer = new StringBuffer();
        int result = 0;
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == ' ' && buffer.length() != 0) {
                result++;
                buffer = new StringBuffer();
            } else if (input.charAt(i) != ' ') {
                buffer.append(input.charAt(i));
            }
        }

        if (buffer.length() != 0) {
            result++;
        }

        System.out.println(result);
    }
}
