package numbersfromrange;

import java.util.Locale;

class NumbersFromRange {
    void showNumbersUsingWhile(int lowerRange, int upperRange) {
        float number = lowerRange;
        System.out.printf("%.1f", number);
        number += 0.1;

        while (number <= upperRange) {
            System.out.printf(", %.1f", number);
            number += 0.1;
        }
    }

    void showNumbersUsingDoWhile(int lowerRange, int upperRange) {
        float number = lowerRange;
        System.out.printf("%.1f", number);
        number += 0.1;

        do {
            System.out.printf(", %1.1f", number);
            number += 0.1f;
        } while (number <= upperRange);
    }
}
