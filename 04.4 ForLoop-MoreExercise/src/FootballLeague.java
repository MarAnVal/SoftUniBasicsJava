import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Капацитетът на стадиона – цяло число в интервала [1 … 10000];
        //2. Броят на всички фенове – цяло число в интервала [1 … 10000].
        //За всеки един фен, на отделен ред се прочита:
        //1. Секторът, на който се намира – текст – "A", "B", "V" и "G".
        int max = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;
        for (int i = 0; i < n; i++){
            String sector = input.nextLine();
            switch (sector){
                case "A": a++; break;
                case "B": b++; break;
                case "V": v++; break;
                case "G": g++; break;
            }

        }
        //Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00%,
        //форматирани до втората цифра след десетичната запетая:
        //1. Процентът на феновете в сектор А%
        System.out.printf("%n%.2f", 100.0 * a / n); System.out.print("%");
        //2. Процентът на феновете в сектор Б%
        System.out.printf("%n%.2f", 100.0 * b / n); System.out.print("%");
        //3. Процентът на феновете в сектор В%
        System.out.printf("%n%.2f", 100.0 * v / n); System.out.print("%");
        //4. Процентът на феновете в сектор Г%
        System.out.printf("%n%.2f", 100.0 * g / n); System.out.print("%");
        //5. Процентът на всички фенове, спрямо капацитета на стадиона.%
        System.out.printf("%n%.2f", 100.0 * n / max); System.out.print("%");
    }
}
