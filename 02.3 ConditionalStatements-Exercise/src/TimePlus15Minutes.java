import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        //чете час и минути от 24-часово денонощие
        // въведени от потребителя и изчислява колко ще е часът след 15 минути
        // Резултатът да се отпечата във формат часове:минути
        // Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59
        // Часовете се изписват с една или две цифри. Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.

        Scanner input = new Scanner(System.in);

        int houer = Integer.parseInt(input.nextLine());
        int min = Integer.parseInt(input.nextLine());

        min = min +15;

        if (min >= 60) {
            min = min % 60;
            houer++;
            if (houer > 23) {
                houer = houer - 24;
            }
        }
         if (min <10){
             System.out.printf("%d:0%d", houer, min);
         } else
             System.out.printf("%d:%d", houer, min);


    }
}
