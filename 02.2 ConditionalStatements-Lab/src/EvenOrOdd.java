import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //чете цяло число
        //Ако е четно отпечатайте "even", ако е нечетно "odd".
        int a = Integer.parseInt(input.nextLine());

        if (a % 2 == 0){
            System.out.println("even");
        } else
            System.out.println("odd");

    }
}
