import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(a.substring(num1,++num2));

    }
}