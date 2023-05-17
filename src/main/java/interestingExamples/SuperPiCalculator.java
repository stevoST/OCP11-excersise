package interestingExamples;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SuperPiCalculator {
    public static void main(String[] args) {
        int precision = 1000; // number of decimal places to calculate
        BigDecimal pi = BigDecimal.ZERO;
        for (int k = 0; k < precision; k++) {
            BigDecimal term = BigDecimal.valueOf(1)
                    .divide(BigDecimal.valueOf(16).pow(k), precision, RoundingMode.HALF_UP)
                    .multiply(BigDecimal.valueOf(4).divide(BigDecimal.valueOf(8 * k + 1), precision, RoundingMode.HALF_UP)
                            .subtract(BigDecimal.valueOf(2).divide(BigDecimal.valueOf(8 * k + 4), precision, RoundingMode.HALF_UP))
                            .subtract(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(8 * k + 5), precision, RoundingMode.HALF_UP))
                            .subtract(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(8 * k + 6), precision, RoundingMode.HALF_UP)));
            pi = pi.add(term);
        }
        System.out.println(pi.setScale(precision, RoundingMode.HALF_UP));
    }
}



