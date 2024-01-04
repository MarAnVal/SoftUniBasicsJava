import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        //Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        //Броят на опаковките храна за котки – цяло число в интервала [0… 100]
        //една опаковка храна за кучета е на цена 2.50 лв, а опаковка храна за котки струва 4 лв.
        //"{крайната сума} lv."
        Scanner input = new Scanner(System.in);
        int dog = Integer.parseInt(input.nextLine());
        int cat = Integer.parseInt(input.nextLine());

        double total = dog * 2.5 + cat * 4.0;

        System.out.printf("%f lv.", total);

    }
}
