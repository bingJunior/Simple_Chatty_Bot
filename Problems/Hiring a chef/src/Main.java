import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.next();
        int age = scanner.nextInt();
        String education = scanner.next();
        int experience = scanner.nextInt();
        String cusine = scanner.next();

        System.out.print("The form for " + firstname + " is completed. We will contact you if we need a chef that cooks " + cusine + " dishes.");

    }
}