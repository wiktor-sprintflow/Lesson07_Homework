package guessnumber;

import java.util.Scanner;

class Number {
    void getNumber() {
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbę:");
            number = in.nextInt();
            in.nextLine();
        } while (validateNumber(number) != 0);
        in.close();
    }

    private int validateNumber(int number) {
        final int LOWER_RANGE = 100;
        final int UPPER_RANGE = 200;
        final int TOO_SMALL = -1;
        final int TOO_BIG = 1;
        final int INDIVISIBLE = 2;
        final int DIVISIBLE = 0;


        if (number < LOWER_RANGE) {
            System.out.println("Podana liczba jest za mała.");
            return TOO_SMALL;
        } else if (number > UPPER_RANGE) {
            System.out.println("Podana liczba jest za duża.");
            return TOO_BIG;
        } else if (number % 3 != 0) {
            System.out.println("Liczba nie jest podzielna przez 3.");
            return INDIVISIBLE;
        } else {
            System.out.println("Twoja liczba jest ok.");
            return DIVISIBLE;
        }
    }
}
