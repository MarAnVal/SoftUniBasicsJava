import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        //която изчислява свободния обем от жилището на Хосе, който остава след като пренесе багажа си.
        //Бележка: Един кашон е с точни размери: 1m. x 1m. x 1m.
        //Широчина на свободното пространство - цяло число в интервала [1...1000]
        //Дължина на свободното пространство - цяло число в интервала [1...1000]
        //Височина на свободното пространство - цяло число в интервала [1...1000]
        //На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в квартирата - цяло число в интервала [1...10000]
        //Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място свърши.
        //Ако стигнете до командата "Done" и има още свободно място:
        //"{брой свободни куб. метри} Cubic meters left."
        //Ако свободното място свърши преди да е дошла команда "Done":
        //"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int h = Integer.parseInt(input.nextLine());
        int freeSpace = a * b * h;

        while (freeSpace > 0){
            String boxes = input.nextLine();
            switch (boxes){
                case "Done":
                    System.out.printf("%d Cubic meters left.", freeSpace);
                    freeSpace = 0;
                    break;
                default:
                    freeSpace -= Integer.parseInt(boxes);
                    if (freeSpace <= 0){
                        System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                    }
                    break;
            }
        }

    }
}
