import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Име на актьора - текст
        //Точки от академията - реално число в интервала [2.0... 450.5]
        //Брой оценяващи n - цяло число в интервала[1… 20]
        String actor = input.nextLine();
        double academy = Double.parseDouble(input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        double total = academy;
        //На следващите n-на брой реда:
        //Име на оценяващия - текст
        //Точки от оценяващия - реално число в интервала [1.0... 50.0]
        //Точките, които актьора получава се формират от:
        for (int i = 0; i < n; i++){
            String name = input.nextLine();
            double points = Double.parseDouble(input.nextLine());
            // дължината на името на оценяващия умножено по точките, които дава делено на две
            //Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата, че дадения актьор е получил номинация.
            total = total + ((name.length() * points) / 2.0);
            //Ако точките са над 1250.5:
            // "Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
            if (total - 1250.5 >= 0){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, total);
                break;
            }
        }
        //Ако точките не са достатъчни:
        // "Sorry, {име на актьора} you need {нужни точки} more!"
        // Резултатът да се форматирана до първата цифра след десетичния знак
        if (total - 1250.5 < 0){
            System.out.printf("Sorry, %s you need %.1f more!",actor, Math.abs(total - 1250.5));
        }
    }
}