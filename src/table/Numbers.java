package table;

import java.util.Scanner;

class Numbers {
    private int[] numbers = new int[5];

    void getNumbers() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę:");
            numbers[i] = input.nextInt();
            input.nextLine();
        }
        input.close();
    }

    int returnOddSum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
