package TaskOne;

public class HomeWork3 {
    public static void main (String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = -10;
        int b = 19;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }
}
