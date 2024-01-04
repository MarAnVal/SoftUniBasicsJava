import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първият ред съдържа час на изпита – цяло число от 0 до 23.
        //Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
        //Третият ред съдържа час на пристигане – цяло число от 0 до 23.
        //Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59

        int houerExam = Integer.parseInt(input.nextLine());
        int minExam = Integer.parseInt(input.nextLine());
        int houerArive = Integer.parseInt(input.nextLine());
        int minsArive = Integer.parseInt(input.nextLine());
        int arive = houerArive * 60 + minsArive;
        int exam = houerExam * 60 + minExam;
        int result = exam - arive;

        if (result < 0){
            // "Late", ако студентът пристига по-късно от часа на изпита.
            //"mm minutes after the start" за закъснение под час.
            //"hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03.
            System.out.println("Late");
            result = Math.abs(result);
            if (result >= 60){
                System.out.printf("%d:%02d hours after the start",result/60,result%60);
             } else System.out.printf("%d minutes after the start", result);
        } else if (result == 0){
            //"On time", ако студентът пристига точно
                System.out.println("On time");
        } else if (result <= 30) {
            //"On time", ако студентът пристига до 30 минути по-рано
            //"mm minutes before the start" за идване по-рано с по-малко от час.
                System.out.println("On time");
                System.out.printf("%d minutes before the start", result);
        } else {
            //"Early", ако студентът пристига повече от 30 минути преди часа на изпита.
            //"mm minutes before the start" за идване по-рано с по-малко от час.
            //"hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
                System.out.println("Early");
                if (result >= 60){
                System.out.printf("%d:%02d hours before the start",result/60,result%60);
                } else System.out.printf("%d minutes before the start", result);

        }


    }
}
