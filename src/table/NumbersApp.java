package table;

public class NumbersApp {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.getNumbers();
        System.out.println("Suma liczby pierwszej, trzeciej i piątej wynosi: " + numbers.returnOddSum());
    }
}
