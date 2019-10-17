package table;

import java.util.Scanner;

class Numbers {

    private int[] getNumbers() {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę:");
            numbers[i] = input.nextInt();
            input.nextLine();
        }
        input.close();
        return numbers;
    }

    int returnOddSum() {
        int[] numbers = getNumbers();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}