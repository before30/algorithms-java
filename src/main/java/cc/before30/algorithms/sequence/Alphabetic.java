package cc.before30.algorithms.sequence;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by before30 on 23/08/2017.
 */
@Slf4j
public class Alphabetic {
    /*
    1 : A
    26 : Z
    27 : AA
    53 : AZ
    54 : BA
     */

    public static String sequenceByForloop(int n) {
        int quotient = n;
        StringBuffer buffer = new StringBuffer();
        do {
            quotient = quotient - 1;
            int remain = quotient % 26;
            quotient = (int)Math.floor(quotient / 26);
            buffer.append((char)('A' + remain));
        } while (quotient > 0);

        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        log.info("{}", ('Z' - 'A' + 1));
        log.info("1 A : {}", sequenceByForloop(1));
        log.info("26 Z : {}", sequenceByForloop(26));
        log.info("27 AA : {}", sequenceByForloop(27));
        log.info("52 AZ : {}", sequenceByForloop(52));
        log.info("53 BA : {}", sequenceByForloop(53));

        // 26 + 26*26
        for (int i=1; i<=18278; i++) {
            log.info("{} : {}", i, sequenceByForloop(i));
        }

    }
}
