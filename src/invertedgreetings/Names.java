package invertedgreetings;

import java.util.Scanner;

class Names {
    private String[] names = new String[5];

    void getNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");

        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        input.close();
    }

    void showInvertedGreetings() {
        int i = names.length;
        while (i > 0) {
            System.out.println("Cześć " + names[i - 1]);
            i--;
        }
    }
}