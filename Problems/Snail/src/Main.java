import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();

        int numberOfDays = (height - night - 1) / (day - night) + 1;

        System.out.println(numberOfDays);
    }
}