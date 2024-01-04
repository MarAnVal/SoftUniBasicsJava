import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Premiere – премиерна прожекция, на цена 12.00 лева.
        //Normal – стандартна прожекция, на цена 7.50 лева.
        // Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        //чете тип прожекция (стринг)
        //брой редове и брой колони в залата (цели числа)
        //изчислява общите приходи от билети при пълна зала.
        //Резултатът да се отпечата във формат с 2 знака след десетичната точка.

        String type = input.nextLine();
        int r = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());
        double total = 0.00;

        switch (type){
            case "Premiere": total = r * c * 12.00; break;
            case "Normal": total = r * c * 7.50; break;
            case "Discount": total = r * c * 5.00; break;
        }
        System.out.printf("%.2f", total);

    }
}
