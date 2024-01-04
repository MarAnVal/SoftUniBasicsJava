import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        //чете две цели числа
        //отпечатва по-голямото от двете.
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        if (a >= b){
            System.out.println(a);
        } else
            System.out.println(b);


    }
}
