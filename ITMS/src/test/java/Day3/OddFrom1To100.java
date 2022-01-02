package Day3;

public class OddFrom1To100 {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 100 are: ");
        for (int number = 1; number <= 100; number = number + 2) {
            System.out.println(number);
        }
    }
}
