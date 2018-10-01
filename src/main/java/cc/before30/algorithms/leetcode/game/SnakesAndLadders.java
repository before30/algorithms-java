package cc.before30.algorithms.leetcode.game;

public class SnakesAndLadders {

    // n * n board를 가지고 있다.
    // https://leetcode.com/problems/snakes-and-ladders/solution/
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int step = 0;
        int curr = 1;
        while (curr < n * n) {
            curr = nextStep(board, curr);
            step++;
        }

        return step;
    }

    public int nextStep(int[][] board, int curr) {
        int n = board.length;
        if (curr + 6 >= n * n) {
            return n * n;
        }

        int next = curr;
        for (int i=1; i<=6; i++) {
            next = Math.max(next, board[getRow(curr + i, n)][getColumn(curr + i, n)]);
        }

        if (next == curr) {
            next = curr + 6;
        }

        return next;
    }

    public int getRow(int x, int n) {
        int row = n - 1 - (x - 1) / n;
        return row;
    }

    public int getColumn(int x, int n) {
        int row = getRow(x, n);
        int remains = (x - 1) % n;

        if (row % 2 != 0) {
            // 짝수인경우 정방향
            return remains;
        } else {
            // 홀수인경우 역방향
            return n - 1 - remains;
        }
    }

    public static void main(String[] args) {
        int[][] input = new int[][] {
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,35,-1,-1,13,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,15,-1,-1,-1,-1}};
        SnakesAndLadders snl = new SnakesAndLadders();
        System.out.println(snl.snakesAndLadders(input)); // output is 4
//        for (int i = 1; i <= 36; i++) {
////            System.out.println(i + " " + snl.getRow(i, 6));
//            System.out.println(i + " "+ snl.getColumn(i, 6));
//        }
    }
}
