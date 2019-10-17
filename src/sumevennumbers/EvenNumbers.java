package sumevennumbers;

class EvenNumbers {
    private int sum;

    void sumEvenNumbers(int lowerRange, int upperRange) {
        for (int i = lowerRange; i <= upperRange; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                i++;
            }
        }

        System.out.println("Suma liczb parzystych z zakresu: [" + lowerRange +", " + upperRange + "] wynosi: " + sum);
    }
}
