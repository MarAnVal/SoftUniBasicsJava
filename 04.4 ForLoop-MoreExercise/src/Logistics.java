import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
        //За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]
        int n = Integer.parseInt(input.nextLine());
        int totalPrice = 0;
        int totalKg = 0;
        int train = 0;
        int truck = 0;
        int van = 0;
        for (int i = 0; i < n; i++){
            int kg = Integer.parseInt(input.nextLine());
            //До 3 тона – микробус (200 лева на тон)
            //От 4 до 11 тона – камион (175 лева на тон)
            //12 и повече тона – влак (120 лева на тон)
            //средната цена на тон превозен товар
            //процента на тоновете превозвани с всяко превозно средство, спрямо общото тегло(в тонове) на всички товари.
            if (kg >= 12){
                totalPrice = totalPrice + 120 * kg;
                train = train + kg;
                totalKg = totalKg + kg;
            } else if (kg >= 4){
                totalPrice = totalPrice + 175 * kg;
                truck = truck + kg;
                totalKg = totalKg + kg;
            }else {
                totalPrice = totalPrice + 200 * kg;
                van = van + kg;
                totalKg = totalKg + kg;
            }
        }
        //Първи ред – средната цена на тон превозен товар (закръглена до втория знак след дес. запетая);
        System.out.printf("%.2f", 1.0 * totalPrice / totalKg);
        //Втори ред – процентът тона превозвани с микробус (процент между 0.00% и 100.00%);
        System.out.printf("%n%.2f", van * 100.0 / totalKg); System.out.print("%");
        //Трети ред – процентът  тона превозвани с камион (процент между 0.00% и 100.00%);
        System.out.printf("%n%.2f", truck * 100.0 / totalKg); System.out.print("%");
        //Четвърти ред – процентът тона превозвани с влак (процент между 0.00% и 100.00%).
        System.out.printf("%n%.2f", train * 100.0 / totalKg); System.out.print("%");
    }
}
