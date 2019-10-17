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
        } while (!validateNumber(number));
        in.close();
    }

    private boolean validateNumber(int number) {
        final int lowerRange = 100;
        final int upperRange = 200;

        if (number < lowerRange) {
            System.out.println("Podana liczba jest za mała.");
            return false;
        } else if (number > upperRange) {
            System.out.println("Podana liczba jest za duża.");
            return false;
        } else if (number % 3 != 0) {
            System.out.println("Liczba nie jest podzielna przez 3.");
            return false;
        } else {
            System.out.println("Twoja liczba jest ok.");
            return true;
        }
    }
}
