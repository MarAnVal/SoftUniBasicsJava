import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //6 реда въведени от потребителя: десетичните числа x1, y1, x2, y2, x и y (като се гарантира, че x1 < x2 и y1 < y2)
        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());
        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());
        double x = Double.parseDouble(input.nextLine());
        double y = Double.parseDouble(input.nextLine());

        //Точка {x, y} лежи върху някоя от страните на правоъгълник {x1, y1} – {x2, y2}, ако е изпълнено едно от следните условия:
        //(x == x1 || == x2) && y1 <= y <= y2
        //(y == y1 || == y2) && x1 <= x <= x2
        if (x == x1 || x == x2){
            if (y1 <= y && y <= y2){
                System.out.print("Border");
            }else System.out.print("Inside / Outside");
        } else if (y == y1 || y == y2){
            if (x1 <= x && x <= x2){
                System.out.print("Border");
            }else System.out.print("Inside / Outside");
        }else System.out.print("Inside / Outside");

        //Да се отпечата "Border" (точката лежи на някоя от страните)
        //"Inside / Outside" (в противен случай).
    }
}
