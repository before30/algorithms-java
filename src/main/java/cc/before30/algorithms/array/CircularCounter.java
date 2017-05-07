package cc.before30.algorithms.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * There are people sitting in a circular fashion,
 * print every third member while removing them,
 * the next counter starts immediately after the member is removed.
 * Print till all the members are exhausted.
 *
 *
 * Created by before30 on 08/05/2017.
 */
public class CircularCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    public static List<Integer> apply(List<Integer> list, int step) {
        if (step <= 0) throw new IllegalArgumentException(step + "is under 1");
        List<Integer> result = new ArrayList<>();
        int idx = 0;
        while(list.size() > 0) {
            idx = (idx + step - 1) % list.size();
            result.add(list.get(idx));
            list.remove(idx);
        }

        return result;

    }
}
