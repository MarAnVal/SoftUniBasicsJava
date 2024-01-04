import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Град  0 ≤ s ≤ 500; 500 < s ≤ 1 000; 1 000 < s ≤ 10 000; s > 10 000
        //Sofia     5%             7%                 8%              12%
        //Varna     4.5%           7.5%               10%             13%
        //Plovdiv   5.5%           8%                 12%             14.5%
        //чете име на град (текст)
        //обем на продажби (реално число)
        //изчислява и извежда размера на търговската комисионна според горната таблица
        //Резултатът да се изведе форматиран до 2 цифри след десетичната точка
        //При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error"
        String town = input.nextLine();
        double sales = Double.parseDouble(input.nextLine());
        double comision = 0;
        double total = 0;
        String flag = "";

        if (sales > 10000) {
            switch (town) {
                case "Sofia":
                    comision = 0.12;
                    break;
                case "Varna":
                    comision = 0.13;
                    break;
                case "Plovdiv":
                    comision = 0.145;
                    break;

                default:
                    flag = "error";
                    break;
            }
        }else if (sales > 1000){
                switch (town){
                    case "Sofia": comision = 0.08; break;
                    case "Varna": comision = 0.1; break;
                    case "Plovdiv": comision = 0.12; break;

                    default: flag = "error"; break;
                }
        } else if (sales > 500){
                switch (town){
                    case "Sofia": comision = 0.07; break;
                    case "Varna": comision = 0.075; break;
                    case "Plovdiv": comision = 0.08; break;

                    default: flag = "error"; break;
                }
        } else if (sales >= 0){
                switch (town){
                    case "Sofia": comision = 0.05; break;
                    case "Varna": comision = 0.045; break;
                    case "Plovdiv": comision = 0.055; break;

                    default: flag = "error"; break;
                }
        } else  flag = "error";

         if (flag.equals("error")){
             System.out.println(flag);
         } else {
             total = sales * comision;
             System.out.printf("%.2f", total);
         }

    }
}
