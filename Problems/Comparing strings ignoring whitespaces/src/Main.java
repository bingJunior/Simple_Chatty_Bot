import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String noWhitespaces1 = s1.replace(" ", "");
        String noWhitespaces2 = s2.replace(" ", "");
        System.out.println(noWhitespaces1.contains(noWhitespaces2)); }

    }