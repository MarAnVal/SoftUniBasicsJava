import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от едно число – броят почивни дни – цяло число в интервала [0...365]
        //нормата за игра на Том е 30 000  минути в година.
        //Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //Когато почива, стопанинът му си играе с него по 127 минути на ден.
        //Ако времето за игра на Том е над нормата за текущата година:
        // На първия ред отпечатайте: “Tom will run away”
        // На втория ред отпечатайте разликата от нормата във формат:
        //“{H} hours and {M} minutes more for play”
        //Ако времето за игра на Том е под нормата за текущата година:
        //На първия ред отпечатайте: “Tom sleeps well”
        // На втория ред отпечатайте разликата от нормата във формат:
        //“{H} hours and {M} minutes less for play”

        int freeDays = Integer.parseInt(input.nextLine());

        int timeToPlay = (365 - freeDays) * 63 + freeDays * 127;
        int leftTimeToPlay = 30000 - timeToPlay;

        if (leftTimeToPlay > 0){
            int min = leftTimeToPlay % 60;
            int houer = leftTimeToPlay / 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", houer, min);
        } else {
            leftTimeToPlay = Math.abs(leftTimeToPlay);
            int min = leftTimeToPlay % 60;
            int houer = leftTimeToPlay / 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", houer, min);

        }




    }
}
