package numbersfromrange;

import java.util.Locale;

class NumbersFromRange {
    void showNumbersUsingWhile(int lowerRange, int upperRange) {
        float number = lowerRange;
        while (number <= upperRange) {
            System.out.printf(Locale.US, "%.1f\n", number);
            number += 0.1f;
        }
    }

    void showNumbersUsingDoWhile(int lowerRange, int upperRange) {
        float number = lowerRange;
        do {
            System.out.printf(Locale.US, "%1.1f\n", number);
            number += 0.1f;
        } while (number <= upperRange);
    }
}
