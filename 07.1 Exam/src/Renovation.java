import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        //1. Височина на стената - цяло число [0… 100]
        //2. Ширина на стената - цяло число [0… 100]
        //3. Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95]
        //На следващите редове до получаване на командата "Tired!" или докато не бъдат боядисани всички стени,
        //се чете по едно число:
        //Литри боя – цяло число [0…100]:
        Scanner input = new Scanner(System.in);
        int h = Integer.parseInt(input.nextLine());
        int w = Integer.parseInt(input.nextLine());
        int notPaintedPercent = Integer.parseInt(input.nextLine());
        String paint = input.nextLine();
        int totalToPain = 4 * w * h * (100 - notPaintedPercent) / 100;
        boolean flag = true;

        while (flag){
            //един литър боя се боядисва един квадратен метър от стената).
            totalToPain -= Integer.parseInt(paint);
            if (totalToPain > 0){
                paint = input.nextLine();
                if (paint.equals("Tired!")){
                    flag = false;
                    System.out.printf("%d quadratic m left." , totalToPain);
                }
            } else if (totalToPain == 0){
                System.out.print("All walls are painted! Great job, Pesho!");
                flag = false;
            } else {
                System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(totalToPain));
                flag = false;
            }

        }
        //При получаване на командата "Tired!":
        //"{квадратни метри} quadratic m left."
        //{квадратни метри} е повърхнината, която му остава да боядисана.
        //Aко е останала боя в излишък:
        //"All walls are painted and you have {литри боя} l
        // paint left!"
        //Aко след боядисването на всички стени, не е останала боя:
        //"All walls are painted! Great job, Pesho!"

    }
}
