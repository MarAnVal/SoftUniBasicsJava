import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //чете парола (текст)
        // проверява дали въведената парола съвпада с фразата "s3cr3t!P@ssw0rd"
        // При съвпадение да се изведе "Welcome". При несъвпадение да се изведе "Wrong password!"
        String pass = input.nextLine();
        if (pass.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else
            System.out.println("Wrong password!");

    }
}
