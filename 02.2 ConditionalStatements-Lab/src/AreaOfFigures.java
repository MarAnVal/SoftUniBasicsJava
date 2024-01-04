import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area = 0;

        //Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
        //Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
        //Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
        //Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
        //пресмята лицето
        //Резултатът да се закръгли до 3 цифри след десетичната запетая.

        String figure = input.nextLine();

        if (figure.equals("square")){
            double a = Double.parseDouble(input.nextLine());
            area = a * a;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")){
            double a = Double.parseDouble(input.nextLine());
            double b = Double.parseDouble(input.nextLine());
            area = a * b;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")){
            double r = Double.parseDouble(input.nextLine());
            area = Math.PI * r * r;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")){
            double a = Double.parseDouble(input.nextLine());
            double h = Double.parseDouble(input.nextLine());
            area = a * h / 2;
            System.out.printf("%.3f", area);
        }


    }
}
