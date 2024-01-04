import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        //От конзолата се чете едно цяло число (контролната стойност): M – цяло число в интервала [4 … 144]
        Scanner input = new Scanner(System.in);
        int m = Integer.parseInt(input.nextLine());
        //Паролата има формат: "abcd"
        //a*b + c*d = M
        //a < b
        //c > d
        //a, b, c и d са числа в интервала [1 - 9]
        int count = 0;
        String pass = "";
        boolean flag = false;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a >= b) {
                    continue;
                }
                for (int c = 1; c <= 9; c++) {

                    for (int d = 1; d <= 9; d++) {
                        if (c <= d) {
                            continue;
                        } else {
                            if (a * b + c * d == m) {
                                if (count > 0) {
                                    System.out.print(" ");
                                }
                                System.out.printf("%d%d%d%d", a, b, c, d);
                                count++;
                                if (count == 4) {
                                    pass = "" + a + b + c + d;
                                }
                            }
                        }

                    }
                }
            }
        }
        //Ако са намерени четворки числа (аbcd), отговарящи на условието, ги отпечатваме всичките с разделител интервал: “{а}{b}{c}{d} ”
        if (pass.length() > 0) {
            System.out.printf("%nPassword: %s", pass);
        } else if (count > 0) {
            System.out.printf("%nNo!");
        } else
            System.out.print("No!");
        //Отпечатва се един от двата реда на нов ред:
        //Ако съществува четвърта четворка се отпечатва: „Password: {а}{b}{c}{d}“
        //Ако НЕ са намерени такива числа или няма  четвърта четворка отпечатваме: “No!”
    }
}
