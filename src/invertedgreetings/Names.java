package invertedgreetings;

import java.util.Scanner;

class Names {

    private String[] getNames() {
        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");

        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        input.close();
        return names;
    }

    void showInvertedGreetings() {
        String[] names = getNames();
        int i = names.length;
        while (i > 0) {
            i--;
            System.out.println("Cześć " + names[i]);
        }
    }
}