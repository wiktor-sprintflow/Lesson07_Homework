package sumevennumbers;

class EvenNumbers {
    private int sumEvenNumbers(int lowerRange, int upperRange) {
        int sum = 0;
        for (int i = lowerRange; i <= upperRange; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                i++;
            }
        }
        return sum;
    }

    String showSumOfEvenNumbers(int lowerRange, int upperRange) {
        return ("Suma liczb parzystych z zakresu: [" + lowerRange + ", " + upperRange + "] wynosi: " + sumEvenNumbers(lowerRange,upperRange));
    }
}
