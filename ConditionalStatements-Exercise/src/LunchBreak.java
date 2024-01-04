import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Времето за обяд ще бъде 1/8 от времето за почивка, а времето за отдих ще бъде 1/4 от времето за почивка.
        //1. Име на сериал – текст
        //2. Продължителност на епизод – цяло число в диапазона [10… 90]
        //3. Продължителност на почивката – цяло число в диапазона [10… 120]
        //Ако времето е достатъчно да изгледате епизода:
        //"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
        //· Ако времето не Ви е достатъчно:
        //"You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."
        //Времето да се закръгли до най-близкото цяло число нагоре.

        String name = input.nextLine();
        int episide = Integer.parseInt(input.nextLine());
        int lunchBreak = Integer.parseInt(input.nextLine());

        double lunch = lunchBreak/8.0;
        double relax = lunchBreak/4.0;
        double leftTime = lunchBreak - lunch - relax;

        if (leftTime >= episide){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(leftTime-episide));
        } else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episide-leftTime));
        }

    }
}
