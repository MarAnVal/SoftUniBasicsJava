import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        // Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
        // 18% отстъпка
        // един кв. м. е 7.61 лв със ДДС.
        // "The final price is: {крайна цена на услугата} lv."
        // "The discount is: {отстъпка} lv."
        Scanner input = new Scanner(System.in);

        double yeard = Double.parseDouble(input.nextLine());

        double total = yeard * 7.61 * 0.82;
        double discount = yeard * 7.61 * 0.18;

        System.out.printf("The final price is: %f lv.%n", total);
        System.out.printf("The discount is: %f lv.", discount);


    }
}
