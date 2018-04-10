package cc.before30.algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class CompanyInvestment {

    public static void main(String[] args) {
        log.info("hello world");

        Scanner scanner = new Scanner(System.in);


        int n  = Integer.parseInt(scanner.next());
        int m  = Integer.parseInt(scanner.next());
        log.info("n : {}, m : {}", n, m);

        int[][] invest = new int[n][m];
        for (int i=0; i<n; i++) {
            scanner.next(); // skip index
            for (int j=0; j<m; j++) {
                invest[i][j] = Integer.parseInt(scanner.next());
                System.out.print(invest[i][j] + " ");
            }
            System.out.println();
        }

    }
}
