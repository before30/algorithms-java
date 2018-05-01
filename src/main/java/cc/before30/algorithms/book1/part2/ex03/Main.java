package cc.before30.algorithms.book1.part2.ex03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author before30 on 2018. 5. 1.
 */
public class Main {
    /*
    https://www.acmicpc.net/problem/1920
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.next());
        Set set = new HashSet<String>();
        for (int i=0; i<n; i++) {
            set.add(scanner.next());
        }

        int m = Integer.parseInt(scanner.next());
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<m; i++) {
            if (set.contains(scanner.next())) {
                stringBuffer.append("1\n");
            } else {
                stringBuffer.append("0\n");
            }
        }
        System.out.println(stringBuffer);
    }
}
