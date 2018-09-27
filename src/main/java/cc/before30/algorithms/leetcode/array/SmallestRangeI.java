package cc.before30.algorithms.leetcode.array;

public class SmallestRangeI {

    public int smallestRangeI2(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int x: A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2*K);
    }
    public int smallestRangeI(int[] A, int K) {

        // Array A의 평균을 구한다.
        int mean = mean(A);
        int[] ans = new int[A.length];
        for (int i=0; i<A.length;i++) {
            ans[i] = cloestMean(mean, K, A[i]);
        }

        return getMax(ans) - getMin(ans);
    }

    public int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int mean(int[] A) {
        int sum = 0;
        for (int i=0; i<A.length; i++) {
            sum += A[i];
        }

        return sum / A.length;
    }

    public int cloestMean(int mean, int k, int a) {

        // a + k < mean -> a + k
        // a - k > mean -> a - k
        // etc -> mean
        if (a + k < mean) {
            return a + k;
        } else if (a - k > mean) {
            return a - k;
        } else {
            return mean;
        }
    }

    public static void main(String[] args) {
        SmallestRangeI smallestRangeI = new SmallestRangeI();

//        System.out.println(smallestRangeI.smallestRangeI(new int[]{1}, 0));
//        System.out.println(smallestRangeI.smallestRangeI(new int[]{0, 10}, 2));
//        System.out.println(smallestRangeI.smallestRangeI(new int[]{1, 3, 6}, 3));
        System.out.println(smallestRangeI.smallestRangeI(new int[]{3, 1, 10}, 4));

    }

}
