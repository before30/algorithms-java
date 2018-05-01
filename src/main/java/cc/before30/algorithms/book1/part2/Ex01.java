package cc.before30.algorithms.book1.part2;

import java.util.Scanner;

/**
 * @author before30 on 2018. 5. 1.
 */

public class Ex01 {
    // https://www.acmicpc.net/problem/2562
    /*
    input
    3
    29
    38
    12
    57
    74
    40
    85
    61
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int location = Integer.MIN_VALUE;
        for (int i=1; i<=9; i++) {
            int num = Integer.parseInt(scanner.next());
            if (num > max) {
                location = i;
                max = num;
            }
        }

        System.out.println(max);
        System.out.println(location);

    }
}
