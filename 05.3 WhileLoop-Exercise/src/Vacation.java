import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        //Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        //Налични пари - реално число в интервала [0.00...25000.00]
        //След това многократно се четат по два реда:
        //Вид действие - текст с възможности "spend" и "save"
        //Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]
        Scanner input = new Scanner(System.in);
        double vacantionMoney = Double.parseDouble(input.nextLine());
        double haveMoney = Double.parseDouble(input.nextLine());
        int flag = 0;
        int days = 0;
        while (true){
            days++;
            String operation = input.nextLine();
            double money = Double.parseDouble(input.nextLine());
            switch (operation){
                case "spend":
                    haveMoney -= money;
                    if (haveMoney < 0){
                        haveMoney = 0;
                    }
                    flag++;
                    break;
                case "save":
                    haveMoney += money;
                    flag = 0;
                    break;
            }
            if (flag >= 5){
                System.out.printf("You can't save the money.%n%d",days);
                break;
            }
            if (haveMoney >= vacantionMoney){
                System.out.printf("You saved the money for %d days.", days);
                break;
            }
        }
        //Програмата трябва да приключи при следните случаи:
        //Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
        //"You can't save the money."
        //"{Общ брой изминали дни}"
        //Ако Джеси събере парите за почивката на конзолата се изписва:
        //"You saved the money for {общ брой изминали дни} days."

    }
}
